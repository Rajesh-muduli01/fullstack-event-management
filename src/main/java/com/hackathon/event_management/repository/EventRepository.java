package com.hackathon.event_management.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.event_management.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	List<Event> findAll();
    Optional<Event> findById(Long id);

}
