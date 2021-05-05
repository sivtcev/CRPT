package com.sivtcev.crpttesttask.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Document
public class Purchase {

    @Id
    private long id;

    @Field
    private long seller;

    @Field
    private long customer;

    @Field
    @DBRef
    private Set<Product> products;
}
