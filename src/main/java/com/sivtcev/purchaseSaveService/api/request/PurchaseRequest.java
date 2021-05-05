package com.sivtcev.purchaseSaveService.api.request;

import com.sivtcev.purchaseSaveService.entity.Product;
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
