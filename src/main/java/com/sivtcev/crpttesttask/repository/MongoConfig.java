package com.sivtcev.crpttesttask.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.sivtcev.crpttesttask.repository")
@Configuration
public class MongoConfig {
}
