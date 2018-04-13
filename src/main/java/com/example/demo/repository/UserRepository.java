package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.User;

public interface UserRepository extends MongoRepository<User, ObjectId>{
	List<User> findAll();
		
	
	@Query(value = "{'role_id._id' : ?0}")
	User findId(ObjectId id);
	

}
