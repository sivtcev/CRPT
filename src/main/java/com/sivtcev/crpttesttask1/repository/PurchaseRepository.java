package com.sivtcev.crpttesttask1.repository;

import com.sivtcev.crpttesttask1.entity.Purchase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseRepository extends MongoRepository<Purchase, String> {
}
