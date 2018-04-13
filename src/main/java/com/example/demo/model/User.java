package com.example.demo.model;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	
	@Id
	private ObjectId _id;
	
	private String username;
	private String password;
	private ArrayList<Role> role_id;
	
	public ArrayList<Role> getRole_id() {
		return role_id;
	}
	public void setRole_id(ArrayList<Role> role_id) {
		this.role_id = role_id;
	}
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
