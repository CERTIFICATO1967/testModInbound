package it.telecomitalia.trcs.middleware.kafka.inbound;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
class KafkaAdapterListeners{

	private final Logger LOG = LoggerFactory.getLogger(KafkaAdapterListeners.class);

	@KafkaListener(
			topics = "#{'${kafka.consumer.topics}'.split(',')}",
			//topics = "${kafka.consumer.topics}",
			groupId ="${kafka.consumer.groupId}"
			)
	void listenerWithHeader(
			@Payload String message,
			@Headers MessageHeaders headers) {
		LOG.info("Listener [{}] - part=[{}]", message, headers.get(KafkaHeaders.RECEIVED_PARTITION_ID));
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
