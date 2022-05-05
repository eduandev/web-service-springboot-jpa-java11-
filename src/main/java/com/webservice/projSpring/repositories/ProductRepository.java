package com.webservice.projSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.projSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
