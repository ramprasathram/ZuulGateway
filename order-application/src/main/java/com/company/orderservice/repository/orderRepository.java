package com.company.orderservice.repository;

import com.company.orderservice.entity.orderEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface orderRepository extends JpaRepository<orderEntity, Integer> {

}
