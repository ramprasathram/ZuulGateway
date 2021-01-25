package com.eureka.customerservice.controller;

import com.eureka.customerservice.entity.CustomerEntity;
import com.eureka.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/{customerid}")
    public Optional<CustomerEntity> findDetails(@PathVariable int customerid){
        return service.findDetails(customerid);
    }

    @PostMapping("/addcustomer")
    public CustomerEntity addcustomer(@RequestBody CustomerEntity customerEntity){
        return service.savecustomer(customerEntity);
    }
}
