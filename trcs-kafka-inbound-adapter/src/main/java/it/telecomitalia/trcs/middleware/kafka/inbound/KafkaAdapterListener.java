package it.telecomitalia.trcs.middleware.kafka.inbound;


import static net.logstash.logback.argument.StructuredArguments.fields;
import static net.logstash.logback.argument.StructuredArguments.value;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import it.telecomitalia.trcs.middleware.kafka.inbound.command.ExecutorSynchronousFailed;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.TrcsInboundExecutorFactory;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogBean.KafkaMessageBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.HydraLogThreadLocal;
import it.telecomitalia.trcs.middleware.kafka.inbound.logging.InboundLogMessages;


@Component
class KafkaAdapterListeners{
	
	@Autowired 
	private KafkaProducer producer;

	private final Logger LOG = LoggerFactory.getLogger(KafkaAdapterListeners.class);

	@Autowired 
	private TrcsInboundExecutorFactory factory;
	
	@KafkaListener(
			topics = "#{'${kafka.consumer.topics}'.split(',')}",
			//topics = "${kafka.consumer.topics}",
			groupId ="${kafka.consumer.groupId}")
	void listenerWithHeader(
			@Payload String message,
			@Headers MessageHeaders headers,
			Acknowledgment ack) {
		
		Instant start= Instant.now();
	      
	      
		LOG.info("Listener [{}] - part=[{}]", message, headers.get(KafkaHeaders.RECEIVED_PARTITION_ID));
		
		HydraLogBean bean = HydraLogThreadLocal.getLogBean();
		
		bean.setSource(TrcsKafkaHeader.objectToString(headers.get(TrcsKafkaHeader.sourceSystem.name())));
		bean.setChannel(TrcsKafkaHeader.objectToString(headers.get(TrcsKafkaHeader.channel.name())));
		bean.setService(TrcsKafkaHeader.objectToString(headers.get(TrcsKafkaHeader.eventType.name())));
		bean.setTransactionId(TrcsKafkaHeader.objectToString(headers.get(TrcsKafkaHeader.transactionID.name())));
		
		bean.getEvent().setHeader(headers);
		
		InboundLogMessages logMessage = InboundLogMessages.SUCCESS;
		Throwable failureException = null;
		
		try {
			byte[] value = (byte[])headers.get(TrcsKafkaHeader.eventType.name());
			TrcsKafkaEventType eventType = TrcsKafkaEventType.getInstance(new String(value));
			
			TrcsInboundExecutor executor = factory.createInstance(eventType);
			
			executor.execute(headers, message);
			
			ack.acknowledge();
			
			bean.setResult(HydraLogBean.Result.success);
					
		} catch (NullPointerException  e) {
			
			bean.setResult(HydraLogBean.Result.discard);
			
			logMessage = InboundLogMessages.INVALID_MESSAGE;
			failureException=e;
			
		} catch (ExecutorSynchronousFailed e) {
			try {
				producer.send(e.getTopic(), 
						      e.getPayload(), 
						      e.getPhoneNumber(), 
						      e.getHeader());
						
				ack.acknowledge();
				
				bean.setResult(HydraLogBean.Result.failure);
				
				bean.getEvent().setResponse(new KafkaMessageBean());
				bean.getEvent().getResponse().setStringHeader(e.getHeader());
				bean.getEvent().getResponse().setPayload(e.getPayloadObject());

				logMessage = InboundLogMessages.FAILURE_ON_GATEWAY;

			} catch (Exception ex) {
				ack.nack(10000); //Imposta il Timeout per le retry
				
				bean.setResult(HydraLogBean.Result.retry);
				
				logMessage = InboundLogMessages.FAILURE_RETRY;
				failureException=ex;
			}
			
		} catch (Throwable t) {
			ack.nack(10000); //Imposta il Timeout per le retry
			
			bean.setResult(HydraLogBean.Result.retry);

			logMessage = InboundLogMessages.FAILURE_RETRY;
			failureException=t;			
		} finally {
			
			Instant end = Instant.now();
		    bean.setElapsed(ChronoUnit.MILLIS.between(start, end));
			
			if (bean.getResult().equals(HydraLogBean.Result.success)) {
				LOG.info(logMessage.getMessage(), 
						value("messageId", logMessage.getCode()),
						fields(bean));
			} else {
				LOG.info(logMessage.getMessage(), 
						value("messageId", logMessage.getCode()),
						fields(bean),
						failureException);
			}
		}
		
	}

	/*
	@KafkaListener(topics = { "reflectoring-1", "reflectoring-2" }, groupId = "reflectoring-group-2")
	void commonListenerForMultipleTopics(String message) {
		LOG.info("MultipleTopicListener - [{}]", message);
	}

	@KafkaListener(topicPartitions = @TopicPartition(topic = "reflectoring-3", partitionOffsets = {
			@PartitionOffset(partition = "0", initialOffset = "0") }), groupId = "reflectoring-group-3")
	void listenToParitionWithOffset(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
			@Header(KafkaHeaders.OFFSET) int offset) {
		LOG.info("ListenToPartitionWithOffset [{}] from partition-{} with offset-{}", message, partition, offset);
	}

	@KafkaListener(topics = "reflectoring-bytes")
	void listenerForRoutingTemplate(String message) {
		LOG.info("RoutingTemplate BytesListener [{}]", message);
	}

	@KafkaListener(topics = "reflectoring-others")
	@SendTo("reflectoring-2")
	String listenAndReply(String message) {
		LOG.info("ListenAndReply [{}]", message);
		return "This is a reply sent to 'reflectoring-2' topic after receiving message at 'reflectoring-others' topic";
	}

	@KafkaListener(id = "1", topics = "reflectoring-user", groupId = "reflectoring-user-mc", containerFactory = "kafkaJsonListenerContainerFactory")
	void listenerWithMessageConverter(User user) {
		LOG.info("MessageConverterUserListener [{}]", user);
	}
	*/

}
