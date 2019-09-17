package com.microservice.User.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.microservice.User.model.Users;



public interface UserDao extends JpaRepository<Users, Integer> {


	Users findByemail(String email);
	
	Users findById(int userId);
	
	@Transactional
    @Modifying
    @Query("update Users u set u.active=true where u.userId=:userId")
	public void blockByuserId(@Param("userId")int userId);
    @Transactional
    @Modifying
    @Query("update Users u set u.active=false where u.userId=:userId")
    public void unblockByuserId(@Param("userId")int userId);
}
