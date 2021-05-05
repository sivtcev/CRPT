package com.sivtcev.crpttesttask1.changelog;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.sivtcev.crpttesttask1.entity.Product;
import com.sivtcev.crpttesttask1.repository.ProductRepository;

@ChangeLog
public class DatabaseChangelog {

    @ChangeSet(order = "001", id = "insertDProducts", author = "sivtcev")
    public void insertProducts(ProductRepository productRepository){
        productRepository.save(new Product("milk", "2364758363546"));
    }
}
