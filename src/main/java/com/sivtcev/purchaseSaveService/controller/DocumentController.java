package com.sivtcev.purchaseSaveService.controller;

import com.sivtcev.purchaseSaveService.api.request.PurchaseRequest;
import com.sivtcev.purchaseSaveService.api.response.CommonResponse;
import com.sivtcev.purchaseSaveService.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("/")
public class DocumentController {

    private final PurchaseService purchaseService;

    @PostMapping("/upload")
    public ResponseEntity<CommonResponse> addPurchase(@RequestBody PurchaseRequest purchaseRequest) {
        return ResponseEntity.ok(purchaseService.addPurchase(purchaseRequest));
    }
}
