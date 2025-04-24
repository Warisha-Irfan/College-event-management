package com.collegeevent.KajalK11.College_event_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;
import java.util.Objects;

/**
 * Represents an event in the college event management system.
 * Contains information about the event title, description, type, status, date, and associated user.
 */
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Event description is required.")
    @Column(nullable = false)
    private String description;

    @NotBlank(message = "Event title is required.")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Event type is required.")
    @Column(nullable = false)
    private String eventType;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private Date eventDate;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    /**
     * Default constructor.
     */
    public Event() {
    }

    /**
     * Parameterized constructor.
     *
     * @param id the event ID
     * @param title the event title
     * @param description the event description
     * @param eventType the type of event
     * @param status the status of the event
     * @param eventDate the date of the event
     * @param userId the ID of the user associated with the event
     */
    public Event(Long id, String title, String description, String eventType,
                 String status, Date eventDate, Long userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventType = eventType;
        this.status = status;
        this.eventDate = eventDate;
        this.userId = userId;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) &&
                Objects.equals(title, event.title) &&
                Objects.equals(description, event.description) &&
                Objects.equals(eventType, event.eventType) &&
                Objects.equals(status, event.status) &&
                Objects.equals(eventDate, event.eventDate) &&
                Objects.equals(userId, event.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, eventType, status, eventDate, userId);
    }

    // toString

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", eventType='" + eventType + '\'' +
                ", status='" + status + '\'' +
                ", eventDate=" + eventDate +
                ", userId=" + userId +
                '}';
    }
}