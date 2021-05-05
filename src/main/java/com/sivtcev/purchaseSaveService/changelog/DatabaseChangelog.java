package com.sivtcev.purchaseSaveService.changelog;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.sivtcev.purchaseSaveService.entity.Product;
import com.sivtcev.purchaseSaveService.repository.ProductRepository;

@ChangeLog
public class DatabaseChangelog {

    @ChangeSet(order = "001", id = "insertDProducts", author = "sivtcev")
    public void insertProducts(ProductRepository productRepository){
        productRepository.save(new Product("milk", "2364758363546"));
    }
}
