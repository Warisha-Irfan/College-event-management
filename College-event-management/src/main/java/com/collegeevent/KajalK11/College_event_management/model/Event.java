package com.collegeevent.KajalK11.College_event_management.model;

import java.util.Date;
import java.util.Objects;

public class Event {
    private Long id;
    private String title;
    private String description;
    private String  eventType;
    private String status;
    private Date eventDate;
    private Long UserId;

    //empty constructor
    public Event() {
    }

    // constructor with conditions/parameters
    public Event(Long id, String title, String description, String eventType, String status, Date eventDate, Long userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventType = eventType;
        this.status = status;
        this.eventDate = eventDate;
        UserId = userId;
    }

    //getter setter
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
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) && Objects.equals(title, event.title) && Objects.equals(description, event.description) && Objects.equals(eventType, event.eventType) && Objects.equals(status, event.status) && Objects.equals(eventDate, event.eventDate) && Objects.equals(UserId, event.UserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, eventType, status, eventDate, UserId);
    }

    //to string

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", eventType='" + eventType + '\'' +
                ", status='" + status + '\'' +
                ", eventDate=" + eventDate +
                ", UserId=" + UserId +
                '}';
    }
}
