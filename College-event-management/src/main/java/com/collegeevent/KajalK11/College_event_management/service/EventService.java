package com.collegeevent.KajalK11.College_event_management.service;

import com.collegeevent.KajalK11.College_event_management.exception.EventNotFoundException;
import com.collegeevent.KajalK11.College_event_management.exception.EventValidationException;
import com.collegeevent.KajalK11.College_event_management.model.Event;
import com.collegeevent.KajalK11.College_event_management.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Service class for managing Event entities.
 * Contains business logic for event operations.
 */
@Service
public class EventService {
    private final EventRepository eventRepository;

    /**
     * Constructs an EventService with the specified repository.
     *
     * @param eventRepository the event repository
     */
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    /**
     * Creates a new event.
     *
     * @param event the event to create
     * @return the created event
     * @throws EventValidationException if the event data is invalid
     */
    public Event createEvent(Event event) throws EventValidationException {
        validateEvent(event);
        return eventRepository.save(event);
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
    public Event updateEvent(Long id, Event event) throws EventNotFoundException, EventValidationException {
        Event existingEvent = getEventById(id);
        validateEvent(event);

        existingEvent.setTitle(event.getTitle());
        existingEvent.setDescription(event.getDescription());
        existingEvent.setEventType(event.getEventType());
        existingEvent.setStatus(event.getStatus());
        existingEvent.setEventDate(event.getEventDate());
        existingEvent.setUserId(event.getUserId());

        return eventRepository.save(existingEvent);
    }

    /**
     * Retrieves an event by its ID.
     *
     * @param id the ID of the event
     * @return the found event
     * @throws EventNotFoundException if the event is not found
     */
    public Event getEventById(Long id) throws EventNotFoundException {
        return eventRepository.findById(id)
                .orElseThrow(() -> new EventNotFoundException("Event not found with id: " + id));
    }

    /**
     * Retrieves all events.
     *
     * @return list of all events
     */
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    /**
     * Deletes an event by its ID.
     *
     * @param id the ID of the event to delete
     * @throws EventNotFoundException if the event is not found
     */
    public void deleteEvent(Long id) throws EventNotFoundException {
        Event event = getEventById(id);
        eventRepository.delete(event);
    }

    /**
     * Searches events by title.
     *
     * @param title the title to search for
     * @return list of matching events
     */
    public List<Event> searchEventsByTitle(String title) {
        return eventRepository.findByTitleContainingIgnoreCase(title);
    }

    /**
     * Retrieves events associated with a specific user.
     *
     * @param userId the ID of the user
     * @return list of events associated with the user
     */
    public List<Event> getEventsByUserId(Long userId) {
        return eventRepository.findByUserId(userId);
    }

    /**
     * Validates event data.
     *
     * @param event the event to validate
     * @throws EventValidationException if validation fails
     */
    private void validateEvent(Event event) throws EventValidationException {
        if (event.getTitle() == null || event.getTitle().isEmpty()) {
            throw new EventValidationException("Event title is required");
        }
        if (event.getDescription() == null || event.getDescription().isEmpty()) {
            throw new EventValidationException("Event description is required");
        }
        if (event.getEventType() == null || event.getEventType().isEmpty()) {
            throw new EventValidationException("Event type is required");
        }
        if (event.getEventDate() == null || event.getEventDate().before(new Date())) {
            throw new EventValidationException("Valid event date is required");
        }
    }

    public void approveEvent(Long id) {
    }

    public void rejectEvent(Long id) {
    }

    public List<Event> getAll() {
    }
}