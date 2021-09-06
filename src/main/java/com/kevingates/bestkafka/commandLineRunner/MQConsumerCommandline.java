package com.kevingates.bestkafka.commandLineRunner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MQConsumerCommandline implements CommandLineRunner {

//    @Override
//    @KafkaListener(topics = "users",groupId = "eth")
//    public void run(String... arg) throws Exception {
//        System.out.println("CommandLineRunner Received Message : " + arg[0]);
//
//        System.out.println("1 MQ Consumer.");
//
//        System.out.println(arg);
//    }

    @Override
    public void run(String... arg) throws Exception {
        System.out.println("CommandLineRunner booting.");
    }
}