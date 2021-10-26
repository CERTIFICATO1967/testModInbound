package it.telecomitalia.trcs.middleware.kafka.inbound.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties.AckMode;

@Configuration
class KafkaConsumerConfig {

    @Value("${kafka.bootstrap-servers}")
    private String bootstrapServers;
    
    @Value("${kafka.auto-reset:earliest}")
    private String autoResetConfig;  //earliest
    
    
    @Value("${kafka.security.protocol:SASL_SSL}")
    private String securuty_protocol;
    @Value("${kafka.sasl.jaas.config:org.apache.kafka.common.security.plain.PlainLoginModule   required username='LTVL5DA226U3NK6L'   password='598mOQXYS9vtO5ZgeXr1uYU19bRpTl4F7xhbnZ3MbpN3+tLnOTAXUwCuXZh5ZIgL';}")
    private String sasl_jassconfig;
    @Value("${kafka.sasl.mechanism:PLAIN}")
    private String sasl_mechanism;
    @Value("${kafka.client.dns.lookup:use_all_dns_ips}")
    private String client_dns_lookup;
    @Value("${kafka.acks:all}")
    private String acks;
    
   /* @Value("${kafka.schema.registry.url: https://{{ SR_ENDPOINT }}}")
    private String schema_registry_url;
    @Value("${kafka.basic.auth.credentials.source:USER_INFO}")
    private String basic_auth_credentials_source;
    @Value("${kafka.basic.auth.user.info:{{ SR_API_KEY }}:{{ SR_API_SECRET }}}")
    private String basic_auth_user_info;*/
    
    Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, autoResetConfig);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        
        
        //
        props.put("security.protocol",securuty_protocol);
        props.put("sasl.jaas.config",sasl_jassconfig);
        props.put("sasl.mechanism",sasl_mechanism);
        props.put("client.dns.lookup",client_dns_lookup);
        props.put("acks",acks);
        
       /*props.put("schema.registry.url",schema_registry_url);
        props.put("basic.auth.credentials.source",basic_auth_credentials_source);
        props.put("basic.auth.user.info",basic_auth_user_info);
        */
        
        
        //
        return props;
    }

    @Bean
    ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }
    
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> 
      kafkaListenerContainerFactory() {
   
        ConcurrentKafkaListenerContainerFactory<String, String> factory =
          new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.getContainerProperties().setAckMode(AckMode.MANUAL_IMMEDIATE);
        return factory;
    }

    /*
    @Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaJsonListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory =
				new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		factory.setMessageConverter(new StringJsonMessageConverter());
		return factory;
	}
*/
}
