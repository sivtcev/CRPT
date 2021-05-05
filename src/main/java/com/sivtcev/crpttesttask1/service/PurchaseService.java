package com.sivtcev.crpttesttask1.service;

import com.sivtcev.crpttesttask1.api.request.PurchaseRequest;
import com.sivtcev.crpttesttask1.api.response.CommonResponse;

public interface PurchaseService {
    CommonResponse addPurchase(PurchaseRequest purchaseRequest);
}
