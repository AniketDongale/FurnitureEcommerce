package com.shoping.repository;


import com.shoping.Entity.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  OrderRepository extends JpaRepository<Orders,Integer> {
}