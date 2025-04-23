package com.collegeevent.KajalK11.College_event_management.repository;

import com.collegeevent.KajalK11.College_event_management.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Event entities.
 * Provides CRUD operations and custom query methods for Event management.
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    /**
     * Finds events containing the given title (case-insensitive).
     *
     * @param title the title to search for
     * @return list of matching events
     */
    List<Event> findByTitleContainingIgnoreCase(String title);

    /**
     * Finds events by their exact title.
     *
     * @param title the exact title to match
     * @return the event with the matching title
     */
    Event findByTitle(String title);

    /**
     * Finds events associated with a specific user.
     *
     * @param userId the ID of the user
     * @return list of events associated with the user
     */
    List<Event> findByUserId(Long userId);
}