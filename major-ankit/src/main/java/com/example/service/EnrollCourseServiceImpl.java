package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EnrollCourseRepo;

@Service
public class EnrollCourseServiceImpl implements EnrollCourseService{
	
	@Autowired
	EnrollCourseRepo er;
}
