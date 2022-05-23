package com.zensar.pay.service;


import java.util.UUID;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.pay.entity.PayEntity;
import com.zensar.pay.repo.PayRepo;







@Service
public class PayService {

@Autowired
private PayRepo repository;

public PayEntity doPayment(PayEntity payment) {
payment.setTransactionId(UUID.randomUUID().toString());
return repository.save(payment);
}



}