package com.hackathon.event_management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.event_management.entities.RSVP;
import com.hackathon.event_management.services.RSVPService;

@RestController
@RequestMapping("/rsvps")
public class RSVPController {
	
	@Autowired
    private RSVPService rsvpService;

    @PostMapping
    public RSVP createRSVP(@RequestBody RSVP rsvp) {
        return rsvpService.createRSVP(rsvp);
    }

    @GetMapping("/{eventId}")
    public List<RSVP> getRSVPsByEventId(@PathVariable Long eventId) {
        return rsvpService.getRSVPsByEventId(eventId);
    }

}
