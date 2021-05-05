package com.sivtcev.crpttesttask1.api.request;

import com.sivtcev.crpttesttask1.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {

    private String seller;
    private String customer;
    private List<Product> products;

}
