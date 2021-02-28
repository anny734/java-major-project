package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.LikeRepo;

public class LikeServiceImpl implements LikeService{
	
	@Autowired
	LikeRepo lr;
}
