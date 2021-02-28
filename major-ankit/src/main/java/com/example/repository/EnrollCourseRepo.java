package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EnrolledCourses;

public interface EnrollCourseRepo extends JpaRepository<EnrolledCourses, Integer>{

}
