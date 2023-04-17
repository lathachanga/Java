package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.document.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
