package com.sivtcev.crpttesttask.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Purchase extends MongoRepository<Purchase, String> {
}
