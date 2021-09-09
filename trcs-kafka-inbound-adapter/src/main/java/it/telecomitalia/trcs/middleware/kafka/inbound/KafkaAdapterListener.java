package it.telecomitalia.trcs.middleware.kafka.inbound;

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

@Component
class KafkaAdapterListeners{
	
	@Autowired KafkaProducer producer;

	private final Logger LOG = LoggerFactory.getLogger(KafkaAdapterListeners.class);

	@Autowired TrcsInboundExecutorFactory factory;
	
	@KafkaListener(
			topics = "#{'${kafka.consumer.topics}'.split(',')}",
			//topics = "${kafka.consumer.topics}",
			groupId ="${kafka.consumer.groupId}")
	void listenerWithHeader(
			@Payload String message,
			@Headers MessageHeaders headers,
			Acknowledgment ack) {
		
		LOG.info("Listener [{}] - part=[{}]", message, headers.get(KafkaHeaders.RECEIVED_PARTITION_ID));
		
		try {
			byte[] value = (byte[])headers.get(TrcsKafkaHeader.eventType.name());
			TrcsKafkaEventType eventType = TrcsKafkaEventType.getInstance(new String(value));
			
			
			TrcsInboundExecutor executor = factory.createInstance(eventType);
			
			executor.execute(headers, message);
			
			LOG.info("ACKNOWLEDGE");
			ack.acknowledge();
			
		} catch (NullPointerException  t) {
			// t.printStackTrace();
			
			LOG.error("Message not valid");
			
		} catch (ExecutorSynchronousFailed ex) {
			
			producer.send(ex.getTopic(), 
					      ex.getPayload(), 
					      ex.getPhoneNumber(), 
					      ex.getHeader());
			
			ack.acknowledge();
			
		} catch (Throwable t) {
			t.printStackTrace();
			
			ack.nack(10000); //Imposta il Timeout per le retry
			
			throw t;
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
