package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepo cr;
}
