package com.sivtcev.crpttesttask.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Product {

    @Id
    long id;

    @Field
    String name;

    @Field
    long code;
}
