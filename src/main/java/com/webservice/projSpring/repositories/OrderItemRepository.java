package com.webservice.projSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.projSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
