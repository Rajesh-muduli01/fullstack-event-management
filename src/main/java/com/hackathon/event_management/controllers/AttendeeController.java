package com.hackathon.event_management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.event_management.entities.RSVP;
import com.hackathon.event_management.repository.RSVPRepository;

@RestController
@RequestMapping("/attendees")
public class AttendeeController {
	
	@Autowired
    private RSVPRepository rsvpRepository;

    @GetMapping("/{eventId}")
    public List<RSVP> getAttendeesByEventId(@PathVariable Long eventId) {
        return rsvpRepository.findByEventId(eventId);
    }
}
