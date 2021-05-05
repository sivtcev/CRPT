package com.sivtcev.purchaseSaveService.service;

import com.sivtcev.purchaseSaveService.api.request.PurchaseRequest;
import com.sivtcev.purchaseSaveService.api.response.CommonResponse;

public interface PurchaseService {
    CommonResponse addPurchase(PurchaseRequest purchaseRequest);
}
