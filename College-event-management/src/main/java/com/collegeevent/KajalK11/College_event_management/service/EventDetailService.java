package com.collegeevent.KajalK11.College_event_management.service;

import com.collegeevent.KajalK11.College_event_management.model.EventDetail;
import com.collegeevent.KajalK11.College_event_management.repository.EventDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventDetailService {

    @Autowired
    private EventDetailRepository repository;

    public EventDetail save(EventDetail detail) {
        return repository.save(detail);
    }

    public List<EventDetail> findAll() {
        return repository.findAll();
    }

    public EventDetail findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
