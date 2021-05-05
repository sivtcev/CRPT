package com.sivtcev.crpttesttask1.repository;

import com.sivtcev.crpttesttask1.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
