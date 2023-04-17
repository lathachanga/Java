package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.document.Books;

public interface BooksRepository extends MongoRepository<Books, String> {

}
