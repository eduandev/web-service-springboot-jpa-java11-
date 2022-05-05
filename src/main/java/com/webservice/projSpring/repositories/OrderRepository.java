package com.webservice.projSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.projSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
