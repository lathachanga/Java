package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Product1;

public interface ProductRepository extends JpaRepository<Product1, Integer> {

}
