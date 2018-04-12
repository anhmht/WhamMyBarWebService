package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class DemoAppController {
	
	@Autowired
	private UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/")
	public String testPage() {
		return "test";
	}
    
    @ResponseBody
    @RequestMapping("/getAllUser")
	public List<User> getAllUser() {
		return this.userRepository.findAll();
	}
    
}
