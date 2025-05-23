package com.onlinestore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.onlinestore.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    
}

