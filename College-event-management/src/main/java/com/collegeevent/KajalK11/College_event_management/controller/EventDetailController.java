package com.collegeevent.KajalK11.College_event_management.controller;


import com.collegeevent.KajalK11.College_event_management.model.EventDetail;
import com.collegeevent.KajalK11.College_event_management.service.EventDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/event-details")
public class EventDetailController {

    @Autowired
    private EventDetailService service;

    @PostMapping
    public EventDetail create(@RequestBody EventDetail detail) {
        return service.save(detail);
    }

    @GetMapping
    public List<EventDetail> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public EventDetail getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

