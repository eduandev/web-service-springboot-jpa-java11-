package com.webservice.projSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.projSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
