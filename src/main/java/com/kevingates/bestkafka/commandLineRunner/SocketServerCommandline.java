package com.kevingates.bestkafka.commandLineRunner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.net.*;

@Component
public class SocketServerCommandline implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("booting Server Socket.");

        ServerSocket serverSocket=new ServerSocket(9006);
        Socket s=serverSocket.accept();//establishes connection and waits for the client

        System.out.println("booted Server Socket.");
    }
}
