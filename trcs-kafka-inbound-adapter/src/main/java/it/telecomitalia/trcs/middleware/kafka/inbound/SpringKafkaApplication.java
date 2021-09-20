package it.telecomitalia.trcs.middleware.kafka.inbound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(scanBasePackages={"it.telecomitalia.trcs.middleware"})
@EnableKafka
public class SpringKafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}
}
