package com.webservice.projSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.projSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
