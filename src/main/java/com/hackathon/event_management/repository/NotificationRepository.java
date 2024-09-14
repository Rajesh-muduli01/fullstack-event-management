package com.hackathon.event_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.event_management.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
	List<Notification> findByEventId(Long eventId);
    public static final List<Notification> findBy = null;
	
	
}
