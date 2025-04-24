package com.collegeevent.KajalK11.College_event_management.controller;

import com.collegeevent.KajalK11.College_event_management.exception.EventNotFoundException;
import com.collegeevent.KajalK11.College_event_management.exception.EventValidationException;
import com.collegeevent.KajalK11.College_event_management.model.Event;
import com.collegeevent.KajalK11.College_event_management.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing Event entities.
 * Provides endpoints for CRUD operations on events.
 */
@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService eventService;

    /**
     * Constructs an EventController with the specified service.
     *
     * @param eventService the event service
     */
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    /**
     * Creates a new event.
     *
     * @param event the event to create
     * @return the created event
     * @throws EventValidationException if the event data is invalid
     */
    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) throws EventValidationException {
        return ResponseEntity.ok(eventService.createEvent(event));
    }

    /**
     * Retrieves an event by its ID.
     *
     * @param id the ID of the event
     * @return the found event
     * @throws EventNotFoundException if the event is not found
     */
    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id) throws EventNotFoundException {
        return ResponseEntity.ok(eventService.getEventById(id));
    }

    /**
     * Retrieves all events.
     *
     * @return list of all events
     */
    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents() {
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    /**
     * Updates an existing event.
     *
     * @param id the ID of the event to update
     * @param event the updated event data
     * @return the updated event
     * @throws EventNotFoundException if the event is not found
     * @throws EventValidationException if the event data is invalid
     */
    @PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event event)
            throws EventNotFoundException, EventValidationException {
        return ResponseEntity.ok(eventService.updateEvent(id, event));
    }

    /**
     * Deletes an event by its ID.
     *
     * @param id the ID of the event to delete
     * @return no content response
     * @throws EventNotFoundException if the event is not found
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) throws EventNotFoundException {
        eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * Searches events by title.
     *
     * @param title the title to search for
     * @return list of matching events
     */
    @GetMapping("/search")
    public ResponseEntity<List<Event>> searchEventsByTitle(@RequestParam String title) {
        return ResponseEntity.ok(eventService.searchEventsByTitle(title));
    }

    /**
     * Retrieves events associated with a specific user.
     *
     * @param userId the ID of the user
     * @return list of events associated with the user
     */
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Event>> getEventsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(eventService.getEventsByUserId(userId));
    }
}