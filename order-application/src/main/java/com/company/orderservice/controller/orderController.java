package com.company.orderservice.controller;

import com.company.orderservice.common.TransactionResponse;
import com.company.orderservice.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.orderservice.common.customerEntity;

@RestController
@RequestMapping("/order")
public class orderController {

    @Autowired
    private orderService service;

    @PostMapping("/addcustorder")
    public TransactionResponse bookOrder(@RequestBody customerEntity req){
        System.out.println("req"+req.getCustomerId());
        System.out.println("HHHHH");
        return service.saveOrder(req);
    }
}
