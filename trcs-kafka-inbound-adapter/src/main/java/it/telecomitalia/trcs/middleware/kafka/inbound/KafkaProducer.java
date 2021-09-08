package it.telecomitalia.trcs.middleware.kafka.inbound;

import java.util.Map;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String payload) {
    	this.send(topic, payload, null, null);
    }
    
    public void send(String topic, String payload, String key) {
    	this.send(topic, payload, key, null);
    }
    
    public void send(String topic, String payload, String key, Map<String, String> headers) {
    	ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, payload);
    	
    	if (headers!=null) {
    		for (String headerKey: headers.keySet()) {
    			String value = headers.get(headerKey);
    			record.headers().add(headerKey, value.getBytes());
    		}
    	}
    	
    	
        LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
        kafkaTemplate.send(record);
    }
}