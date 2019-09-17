package com.microservice.User.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.User.dao.UserDao;
import com.microservice.User.model.Users;



@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userdao;

	
	public void insertUser(Users users) {
		userdao.save(users);
		
	}


	public Users findByemail(String email) {
		return userdao.findByemail(email);
	}



	public List<Users> getuserList() {
		return userdao.findAll();
	}


	
	public void blockById(int userId) {
		userdao.blockByuserId(userId);
		
	}



	public void unblockById(int userId) {
		userdao.unblockByuserId(userId);
	}


	

}
