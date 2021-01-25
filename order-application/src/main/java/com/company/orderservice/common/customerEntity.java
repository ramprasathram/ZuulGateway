package com.company.orderservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class customerEntity {

    private int customerId;
    private String customername;
    private String address;
    private long phone;

}
