package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

public class QueryService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	
	public List<User> roleUserOrTest() {
		List<Role> lstRole = new ArrayList();
		List<User> lstUser = new ArrayList();
		
		lstRole = (ArrayList) roleRepository.testOr();
		
		for(int i = 0; i < lstUser.size(); i++) {
			lstUser.add(userRepository.findId(lstRole.get(i).get_id()));
		}
		
		return lstUser;
	}

}
