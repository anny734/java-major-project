package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo ur;

	@Override
	public String createUser(User u) {
		ur.save(new User(u.getUsername(), u.getEmail(), u.getPassword()));
		return "user added sucessfully";
	}

	@Override
	public List<User> getUsers() {
		return null;
	}

	@Override
	public String forLogin(String userName, String email, String password) {
		if(userName != null) {
			//invalid username
			//invalid password
			//check both then return true
		}
		return "login sucessful";
	}

	@Override
	public User getuserDetails(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String genarateOTP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUsernames() {
		// TODO Auto-generated method stub
		return null;
	}
}
