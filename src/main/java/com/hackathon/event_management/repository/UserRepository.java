package com.hackathon.event_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.event_management.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	 List<User> findAll();

}
