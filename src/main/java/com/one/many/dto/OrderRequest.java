package com.one.many.dto;

import com.one.many.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class OrderRequest {
    private Customer  customer;
}
