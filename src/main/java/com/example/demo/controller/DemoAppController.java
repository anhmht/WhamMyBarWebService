package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.QueryService;

@RestController
public class DemoAppController {
	
	QueryService servive;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;

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
    
    @ResponseBody
    @RequestMapping("/getAllRole")
	public List<Role> getAllRole() {
		return this.roleRepository.findAll();
	}
    
    @ResponseBody
    @RequestMapping("/insertUser")
    public void insertUser() {
    	Role role1 = new Role();
    	role1.setRole_name("guest");
    	ArrayList<Role> lstRole = new ArrayList(); 
    	lstRole.add(role1);
    	
    	User kyAn = new User();
    	kyAn.setUsername("Đỗ Kỳ An");
    	kyAn.setPassword("CucXuong");
    	kyAn.setRole_id(lstRole);
    	
    	this.roleRepository.save(role1);
    	this.userRepository.save(kyAn);
    	
    }
    
    @ResponseBody
    @RequestMapping("/getRoleAdmin")
    public Role getRoleAdmin() {
    	return this.roleRepository.findbyRole();
    }
    
    @ResponseBody
    @RequestMapping("/insertUserByGetRoleData")
    public void insertUserByGetRoleData() {
    	
    	ArrayList<Role> lstRole = new ArrayList<>(); 
    	lstRole.add(this.roleRepository.findbyRole());
    	
    	User kyAn = new User();
    	kyAn.setUsername("Đỗ Leader");
    	kyAn.setPassword("CucXuong");
    	kyAn.setRole_id(lstRole);
    	
    	this.userRepository.save(kyAn);
    	
    }
    
    @ResponseBody
    @RequestMapping("/getOr")
    public List<User> getOr() {
    	return servive.roleUserOrTest();
    }
    
    @ResponseBody
    @RequestMapping("/findRoleAdmin")
    public Role findRoleAdmin() {
    	return this.roleRepository.findbyRole();
    }
    
}
