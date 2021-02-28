package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ProfileRepo;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	ProfileRepo pr;
}
