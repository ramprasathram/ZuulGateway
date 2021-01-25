package com.company.orderservice.service;

import com.company.orderservice.common.TransactionResponse;
import com.company.orderservice.common.customerEntity;
import com.company.orderservice.entity.orderEntity;
import com.company.orderservice.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class orderService {
    @Autowired
    public orderRepository repository;

    @Autowired
    private RestTemplate restTemplate;



    public TransactionResponse saveOrder(customerEntity req){
        String res = "";
        int custId=0;
        orderEntity order =new orderEntity();

        System.out.println("CustomerId"+req.getCustomerId());

        if(req.getCustomerId()!=0){
            custId=req.getCustomerId();

        }
        System.out.println("custId"+custId);
        customerEntity customerResponse =restTemplate.getForObject("http://customer-application:8081/customer/"+custId,customerEntity.class);


        if(customerResponse.getCustomerId()!=0 && (customerResponse.getCustomerId()>2
                || customerResponse.getCustomername().contains("Senthil"))){

            order.setCustid(customerResponse.getCustomerId());
            order.setCustname(customerResponse.getCustomername());
            order.setCustaddr(customerResponse.getAddress());
            order.setCustphone(customerResponse.getPhone());
            repository.save(order);
            res="Success and data is added in Order table";
        }else
        {
            res="Failed and data is not added in Order table";
        }


        return new TransactionResponse(order,res);
    }
}
