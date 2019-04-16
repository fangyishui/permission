package com.jpa.permission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jpa.permission.dao.UserRepositiry;
import com.jpa.permission.role.Role;
import com.jpa.permission.user.User;

@Controller
public class UserController {

	@Autowired
	private UserRepositiry userRepo;
	
	@RequestMapping("/tt")
	@ResponseBody
	public String saveUser() {
		
		Role r = new Role();
		r.setRoleName("管理员");
		
		User u = new User();
		u.setUserName("Tome");
		u.getRoles().add(r);
		
		try {
			userRepo.save(u);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
}
