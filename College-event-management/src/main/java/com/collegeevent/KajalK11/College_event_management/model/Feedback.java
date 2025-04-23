package com.collegeevent.KajalK11.College_event_management.model;

import java.util.Objects;

public class Feedback {
    private Long id;
    private Long eventId;
    private Long userId;
    private String message;
    private int rating;

    // empty constructor

    public Feedback() {
    }

    // constructor with parameter

    public Feedback(Long id, Long eventId, Long userId, String message, int rating) {
        this.id = id;
        this.eventId = eventId;
        this.userId = userId;
        this.message = message;
        this.rating = rating;
    }

    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return rating == feedback.rating && Objects.equals(id, feedback.id) && Objects.equals(eventId, feedback.eventId) && Objects.equals(userId, feedback.userId) && Objects.equals(message, feedback.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventId, userId, message, rating);
    }

    //to string

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", eventId=" + eventId +
                ", userId=" + userId +
                ", message='" + message + '\'' +
                ", rating=" + rating +
                '}';
    }
}
