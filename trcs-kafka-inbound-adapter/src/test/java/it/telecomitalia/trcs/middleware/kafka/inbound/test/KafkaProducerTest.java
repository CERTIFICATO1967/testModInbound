package it.telecomitalia.trcs.middleware.kafka.inbound.test;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.TrcsKafkaHeader;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.dto.ChangeNumberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.dto.DeleteSubscriberXRequestBean;

@SpringBootTest
@DirtiesContext
public class KafkaProducerTest {

    @Autowired
    private KafkaProducer producer;

    @Value("${test.topic}")
    private String topic;

  //  @Test
    public void sendMessage() throws Exception {
    	String phoneNumber="3391231234";
    	
    	HashMap<String, String> headers = new HashMap<>();
    	
    	headers.put(TrcsKafkaHeader.eventType.name(), TrcsKafkaEventType.changeNumberRequest.value());
    	headers.put(TrcsKafkaHeader.transactionID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.businessID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.sourceSystem.name(), "JunitTest");
    	
    	ChangeNumberRequestBean bean = new ChangeNumberRequestBean();
    	
    	bean.setPhoneNumber(phoneNumber);
    	bean.setBaseOffer("OB001");
    	bean.setPhoneNumberOLO("3393214321");
    	bean.setTypeOfCard("TOC-01");
    	bean.setTypeOfCustomer("CUST-001");
    	bean.setInfo("Info");
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	
    	objectMapper.writeValue(out, bean);
        producer.send(topic, out.toString(), phoneNumber, headers);        
    }
    
    @Test
    public void sendMessageDeleteSubscriberX() throws Exception {
    	String phoneNumber="3391231234";
    	
    	HashMap<String, String> headers = new HashMap<>();
    	
    	headers.put(TrcsKafkaHeader.eventType.name(), TrcsKafkaEventType.deleteSubscriberXRequest.value());
    	headers.put(TrcsKafkaHeader.transactionID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.businessID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.sourceSystem.name(), "JunitTest");
    	
    	DeleteSubscriberXRequestBean bean = new DeleteSubscriberXRequestBean();
    	
    	bean.setPhoneNumber(phoneNumber);
    	bean.setDeleteType("setDeleteType");
    	bean.setDiscountRecover(true);
    	bean.setReason("setReason");
    	bean.setInfo("setInfo");
    	//bean.setBaseOffer("OB001");
    	//bean.setPhoneNumberOLO("3393214321");
    	//bean.setTypeOfCard("TOC-01");
    	//bean.setTypeOfCustomer("CUST-001");
    	//bean.setInfo("Info");
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	
    	objectMapper.writeValue(out, bean);
        producer.send(topic, out.toString(), phoneNumber, headers);        
    }
}