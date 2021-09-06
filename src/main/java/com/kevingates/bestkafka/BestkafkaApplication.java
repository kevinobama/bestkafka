package com.kevingates.bestkafka;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestkafkaApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(BestkafkaApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("ApplicationRunner");
	}
}