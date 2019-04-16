package com.jpa.permission.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.permission.user.User;

public interface UserRepositiry extends JpaRepository<User, Long>{

//	User findByuserName(String userName);

//    List<User> findByuserNameContaining(String userName);
	
//    User save(User u);
//    studentDao.save(student);
//    User saveAll(User user);
}
