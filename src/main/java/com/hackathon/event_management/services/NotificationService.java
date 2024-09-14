package com.hackathon.event_management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.event_management.entities.Event;
import com.hackathon.event_management.entities.Notification;
import com.hackathon.event_management.entities.User;
import com.hackathon.event_management.repository.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
    private NotificationRepository notificationRepository;

    public void sendReminder(Event event) {
        // logic to send reminder notification
        Notification notification = new Notification(event, "Reminder: " + event.getName());
        notificationRepository.save(notification);
    }

    public void sendNotification(Event event, User user) {
        // logic to send notification
        Notification notification = new Notification(event, user, "You have been invited to " + event.getName());
        notificationRepository.save(notification);
    }
}
