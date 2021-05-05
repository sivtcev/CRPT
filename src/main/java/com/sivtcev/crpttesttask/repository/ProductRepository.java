package com.sivtcev.crpttesttask.repository;

import com.sivtcev.crpttesttask.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
