package com.jpa.permission;


import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.permission.dao.UserRepositiry;
import com.jpa.permission.role.Role;
import com.jpa.permission.user.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionApplicationTests {

	@Autowired
	private UserRepositiry userRepo;
	
	@Test
	public void saveUser() {
		User u = new User();
		u.setUserName("JAVA");
		
		Role r = new Role();
		r.setRoleName("管理员");
		u.getRoles().add(r);
		userRepo.save(u);
//		userRepositury.saveUser(u);
	}
	
	@Test
    public void findById() {
        System.out.println(userRepo.findById(3l));
    }
	
	@Test
	public void insertUser() {
		
		User user = new User();
		
		Role role1 = new Role();
		role1.setRoleName("第一个role");
		role1.setUrl("diyigeURL");
		
		Role role2 = new Role();
		role2.setRoleName("第一个role");
		role2.setUrl("diyigeURL");
		
		Set<Role> roles = new HashSet<Role>();
		roles.add(role1);
		roles.add(role2);
		
		user.setUserName("Tom");
//		user.setRoles(roles);
		
//		userRepositury.saveUser(user);
	}
}
