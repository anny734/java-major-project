package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {
//	1. createUser --> register
//	2. getUsers --> for admin
//	*. forLogin --> get all user details along with password and login(username,email)
//	3. getUserDetails --> for settings tab in user dashboard , don't show password in UI 
//		this is for change password
//	4. getPassword --> for change password page :- get only password to check he is correct user
//	5. change password --> first check new and confirm password in frontend and then change in db
//	      this is for forget passowrd
//	6. getUserEmail --> get email from user
//	*. generateTemporaryPassword --> genarate tempory password in backend in serviceImpl then send mail to user  
//	*. getTemporaryPassword --> from backend to verify and then call new and confirm passowrd to change password
//	    	this is for failed attempts
//	7. when failed to login what to send in db and check the counter, after 3 then account lock, tell user to send email to 
//	     admin show format to user , admin--> send email with temporay passoword , get the password from admin and check that in 
//	     user side for next login
//		this is for Register
//	9. generateOTP --> register in backend generate otp and send it to user via email and check that with user entered in UI 
//	10. getUsernames --> register new username , don't use existing username
	
	public abstract String createUser(User u);
	public abstract List<User> getUsers(); // for admin
	public abstract String forLogin(String userName, String email, String password);
	public abstract User getuserDetails(int userId);
	public abstract String getPassword();
	public String changePassword(String password);
//	forget password remaining
//	failed attempt remaining
	public abstract String genarateOTP();
	public List<String> getUsernames();
}
