package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Integer>{

}
