package com.kevingates.bestkafka;

import redis.clients.jedis.Jedis;

public class KevingatesOne {

    public static void main(String[] args) {
        Jedis redis = new Jedis();
        redis = new Jedis("127.0.0.1", 6379);

        redis.set("authorOne", "kevingates");

        String data = redis.get("authorOne");

        System.out.println(data);
    }
}
