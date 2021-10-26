package it.telecomitalia.trcs.middleware.kafka.inbound.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig {
	
	@Value("${kafka.bootstrap-servers}")
	private String bootstrapServers;

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
	
	/*@Value("${kafka.schema.registry.url: https://{{ SR_ENDPOINT }}}")
	private String schema_registry_url;
	@Value("${kafka.basic.auth.credentials.source:USER_INFO}")
	private String basic_auth_credentials_source;
	@Value("${kafka.basic.auth.user.info:{{ SR_API_KEY }}:{{ SR_API_SECRET }}}")
	private String basic_auth_user_info;*/

    @Bean
    public ProducerFactory<String, String> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
          ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, 
          bootstrapServers);
        configProps.put(
          ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, 
          StringSerializer.class);
        configProps.put(
          ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, 
          StringSerializer.class);
        configProps.put("security.protocol",securuty_protocol);
        configProps.put("sasl.jaas.config",sasl_jassconfig);
        configProps.put("sasl.mechanism",sasl_mechanism);
        configProps.put("client.dns.lookup",client_dns_lookup);
        configProps.put("acks",acks);
        
       /* configProps.put("schema.registry.url",schema_registry_url);
        configProps.put("basic.auth.credentials.source",basic_auth_credentials_source);
        configProps.put("basic.auth.user.info",basic_auth_user_info);*/
        
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
