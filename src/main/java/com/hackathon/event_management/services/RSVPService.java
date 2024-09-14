package com.hackathon.event_management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.event_management.entities.RSVP;
import com.hackathon.event_management.repository.RSVPRepository;

@Service
public class RSVPService {
	
	@Autowired
    private RSVPRepository rsvpRepository;

    public RSVP createRSVP(RSVP rsvp) {
        return rsvpRepository.save(rsvp);
    }

    public RSVP updateRSVP(RSVP rsvp) {
        return rsvpRepository.save(rsvp);
    }

    public List<RSVP> getRSVPsByEventId(Long eventId) {
        return rsvpRepository.findByEventId(eventId);
    }

    public List<RSVP> getRSVPsByUserId(Long userId) {
        return rsvpRepository.findByUserId(userId);
    }

}
