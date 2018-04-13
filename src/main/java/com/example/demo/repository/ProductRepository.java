package com.example.demo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Product;
import com.example.demo.model.User;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {

	List<Product> findAll();
	
}
