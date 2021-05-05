package com.sivtcev.purchaseSaveService.entity;

import com.sivtcev.purchaseSaveService.api.request.PurchaseRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {

    @Field
    private String seller;

    @Field
    private String customer;

    @Field
    @DBRef
    private List<Product> products;

    public Purchase(PurchaseRequest purchaseRequest){
        this.seller = purchaseRequest.getSeller();
        this.customer = purchaseRequest.getCustomer();
        this.products = purchaseRequest.getProducts();
    }
}
