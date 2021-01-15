package com.one.many.repository;

import com.one.many.model.Customer;
import com.one.many.model.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    @Query("select new com.one.many.model.OrderResponse (c.name,p.productName) from Customer c join c.products p")
    public List<OrderResponse> getJoinData();
}
