package com.kevingates.bestkafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducersController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/sendUsers")
    public String sendMessage() {
        //{"Manufacturer": "ZX", "Device_Type": 1, "IMEI": "123456789012345", "IMSI": "460007744130492",
        //"Hardware_Version": "V1.0", "Firmware_Version": "V1.0"}
        String data = "{\"Manufacturer\": \"ZX\", \"Device_Type\": 1, \"IMEI\": \"123456789012345\", \"IMSI\": \"460007744130492\",\n" +
                "\"Hardware_Version\": \"V1.0\", \"Firmware_Version\": \"V1.0\"}";
        kafkaTemplate.send("users", data);

        return "sent message";
    }

    @GetMapping("/sendDevices")
    public String sendMessage1() {
        kafkaTemplate.send("orders", "elon musk elon musk@gmail.com theUS");

        return "sent message";
    }
}