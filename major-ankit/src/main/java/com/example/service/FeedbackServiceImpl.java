package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.FeedbackRepo;

public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	FeedbackRepo fr;
}
