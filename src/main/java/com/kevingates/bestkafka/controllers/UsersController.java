package com.kevingates.bestkafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/users")
    public String sendMessage() {
        //kafkaTemplate.send("users", "billgates billgates@gmail.com shanghai");

        return "message";
    }
}