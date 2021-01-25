package com.company.orderservice.common;

import com.company.orderservice.entity.orderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private orderEntity order;
    private String res;

}
