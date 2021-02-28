package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseRepo cr;
}
