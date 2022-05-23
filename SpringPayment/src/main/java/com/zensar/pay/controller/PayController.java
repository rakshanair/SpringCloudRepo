package com.zensar.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.zensar.pay.entity.PayEntity;
import com.zensar.pay.service.PayService;




@RestController
@RequestMapping("/payment")
public class PayController {

@Autowired
private PayService service;

@PostMapping("/doPayment")
public PayEntity doPayment(@RequestBody PayEntity payment) {
return service.doPayment(payment);
}



}