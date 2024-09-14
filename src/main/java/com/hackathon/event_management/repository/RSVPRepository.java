package com.hackathon.event_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.event_management.entities.RSVP;

public interface RSVPRepository extends JpaRepository<RSVP, Long> {
	
	List<RSVP> findByEventId(Long eventId);

	List<RSVP> findByUserId(Long userId);

}
