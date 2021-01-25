package com.company.orderservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class orderEntity {

    @Id
    @GeneratedValue
    private int custid;
    private String custname;
    private String custaddr;
    private long custphone;



}
