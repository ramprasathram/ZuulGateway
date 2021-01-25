package com.eureka.customerservice.service;

import com.eureka.customerservice.entity.CustomerEntity;
import com.eureka.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public Optional<CustomerEntity> findDetails(int customerid){

        return repo.findById(customerid);
    }
    public CustomerEntity savecustomer(CustomerEntity customerEntity){

        return repo.save(customerEntity);
    }
}
