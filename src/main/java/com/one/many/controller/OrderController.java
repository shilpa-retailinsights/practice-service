package com.one.many.controller;

import com.one.many.dto.OrderRequest;
import com.one.many.model.Customer;
import com.one.many.model.OrderResponse;
import com.one.many.repository.CustomerRepo;
import com.one.many.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){
        return customerRepo.save(orderRequest.getCustomer());
    }
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
       return customerRepo.findAll();
    }

    @GetMapping("/joinData")
    public List<OrderResponse> getJoinData(){
        return customerRepo.getJoinData();
    }
}
