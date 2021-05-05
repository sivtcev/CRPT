package com.sivtcev.crpttesttask1.service;

import com.sivtcev.crpttesttask1.api.request.PurchaseRequest;
import com.sivtcev.crpttesttask1.api.response.CommonResponse;
import com.sivtcev.crpttesttask1.entity.Product;
import com.sivtcev.crpttesttask1.entity.Purchase;
import com.sivtcev.crpttesttask1.repository.ProductRepository;
import com.sivtcev.crpttesttask1.repository.PurchaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final ProductRepository productRepository;

    @Override
    public CommonResponse addPurchase(PurchaseRequest purchaseRequest) {
        final int NOT_PRODUCT_ID_LENGTH = 9;
        final int PRODUCT_ID_LENGTH = 13;
        List<Product> products = purchaseRequest.getProducts();

        if (purchaseRequest.getSeller().length() != NOT_PRODUCT_ID_LENGTH ||
                !purchaseRequest.getSeller().matches("[0-9]+")) {
            return new CommonResponse("empty or invalid seller");
        }
        if (purchaseRequest.getCustomer().length() != NOT_PRODUCT_ID_LENGTH ||
                !purchaseRequest.getCustomer().matches("[0-9]+")) {
            return new CommonResponse("empty or invalid seller");
        }

        if (products.isEmpty()) {
            return new CommonResponse("empty product list");
        }
        for (Product product : products) {
            if (product.getName().isEmpty() || product.getCode().length() != PRODUCT_ID_LENGTH ||
                    !product.getCode().matches("[0-9]+")) {
                return new CommonResponse("empty or invalid product in list");
            }
        }

        purchaseRepository.save(new Purchase(purchaseRequest));
        productRepository.saveAll(products);

        return new CommonResponse("success");
    }
}
