package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Like;

public interface LikeRepo extends JpaRepository<Like, Integer>{

}
