package com.sivtcev.purchaseSaveService.repository;

import com.sivtcev.purchaseSaveService.entity.Purchase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseRepository extends MongoRepository<Purchase, String> {
}
