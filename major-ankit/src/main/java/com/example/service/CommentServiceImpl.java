package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.CommentRepo;

public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentRepo cr;
}
