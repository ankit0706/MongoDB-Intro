package com.skydeck.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoDbIntroApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbIntroApplication.class, args);
    }

}
