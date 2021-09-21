package it.telecomitalia.trcs.middleware.kafka.inbound.test;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.telecomitalia.trcs.middleware.kafka.inbound.KafkaProducer;
import it.telecomitalia.trcs.middleware.kafka.inbound.command.impl.DeleteSubscriberExecutor;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeCardRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.ChangeNumberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.DeleteSubscriberRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.SetSubscriberStatusXRequestBean;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaEventType;
import it.telecomitalia.trcs.middleware.kafka.inbound.dto.TrcsKafkaHeader;


@SpringBootTest
@DirtiesContext
public class KafkaProducerTest {
	private final Logger logger = LoggerFactory.getLogger(KafkaProducerTest.class);
    @Autowired
    private KafkaProducer producer;

    @Value("${test.topic}")
    private String topic;

    //@Test
    public void sendMessageChangeNumber() throws Exception {
    	logger.debug("sendMessageChangeNumber");
    	String phoneNumber="3391231232";
    	
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
    
   // @Test
    public void sendMessageDeleteSubscriberX() throws Exception {
    	logger.debug("sendMessageDeleteSubscriberX");
    	String phoneNumber="3391231299";
    	
    	HashMap<String, String> headers = new HashMap<>();
    	
    	headers.put(TrcsKafkaHeader.eventType.name(), TrcsKafkaEventType.deleteSubscriberRequest.value());
    	headers.put(TrcsKafkaHeader.transactionID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.businessID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.sourceSystem.name(), "JunitTest");
    	
    	DeleteSubscriberRequestBean bean = new DeleteSubscriberRequestBean();
    	
    	bean.setPhoneNumber(phoneNumber);
    	bean.setDeleteType("MnpMvno");
    	bean.setDiscountRecover(false);
    	bean.setReason("setReason");
    	bean.setInfo("setInfo");
    	bean.setPhoneNumberMnp("3391231234");
    	bean.setTypeOfCard("setTypeOfCard");
    	
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	
    	objectMapper.writeValue(out, bean);
        producer.send(topic, out.toString(), phoneNumber, headers);        
    }
    
    //@Test
    public void sendMessageDeleteSubscriber() throws Exception {
    	logger.debug("sendMessageDeleteSubscriber");
    	String phoneNumber="3391231200";
    	
    	HashMap<String, String> headers = new HashMap<>();
    	
    	headers.put(TrcsKafkaHeader.eventType.name(), TrcsKafkaEventType.deleteSubscriberRequest.value());
    	headers.put(TrcsKafkaHeader.transactionID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.businessID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.sourceSystem.name(), "JunitTest");
    	
    	DeleteSubscriberRequestBean bean = new DeleteSubscriberRequestBean();
    	
    	bean.setPhoneNumber(phoneNumber);
    	bean.setDeleteType("MnpMvno");
    	bean.setDiscountRecover(true);
    	bean.setReason("setReason");
    	bean.setInfo("setInfo");
    	bean.setPhoneNumberMnp("setPhoneNumberMnp");
    	bean.setTypeOfCard("setTypeOfCard");
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	
    	objectMapper.writeValue(out, bean);
        producer.send(topic, out.toString(), phoneNumber, headers);        
    }
    
    
    //@Test
    public void sendMessageChangeCard() throws Exception {
    	logger.debug("sendMessageChangeCard");
    	String phoneNumber="3391231239";
    	
    	HashMap<String, String> headers = new HashMap<>();
    	
    	headers.put(TrcsKafkaHeader.eventType.name(), TrcsKafkaEventType.changeCardRequest.value());
    	headers.put(TrcsKafkaHeader.transactionID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.businessID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.sourceSystem.name(), "JunitTest");
    	
    	ChangeCardRequestBean bean = new ChangeCardRequestBean();
    	
    	bean.setPhase("setPhase");
    	bean.setFeatures("setFeatures");
    	bean.setIccidNew("8939019876543210321");
    	bean.setIccidOld("8939011234567891234");
    	bean.setImsiOld("222013395947770");
    	bean.setImsiNew("222023395947200");
    	bean.setPhoneNumber(phoneNumber);
    	
    	
    	bean.setInfo("setInfo");
    	
    	bean.setTypeOfCard("ChNoBlockState");
    	bean.setUnblockSubscriber(false);
    	
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	
    	objectMapper.writeValue(out, bean);
        producer.send(topic, out.toString(), phoneNumber, headers);        
    }
    
    
     @Test
    public void sendMessageSetSubscriberStatusX() throws Exception {
    	logger.debug("sendMessageSetSubscriberStatusX");
    	String phoneNumber="3391230000";
    	
    	HashMap<String, String> headers = new HashMap<>();
    	
    	headers.put(TrcsKafkaHeader.eventType.name(), TrcsKafkaEventType.setSubscriberStatusXRequest.value());
    	headers.put(TrcsKafkaHeader.transactionID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.businessID.name(), UUID.randomUUID().toString());
    	headers.put(TrcsKafkaHeader.sourceSystem.name(), "JunitTest");
    	
    	SetSubscriberStatusXRequestBean bean = new SetSubscriberStatusXRequestBean();
    	
    	bean.setOldReason("Q");
    	bean.setReason("A");
       	bean.setPhoneNumber(phoneNumber);
    	bean.setInfo("setInfo");
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	
    	objectMapper.writeValue(out, bean);
        producer.send(topic, out.toString(), phoneNumber, headers);        
    }
}