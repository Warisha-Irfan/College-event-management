package com.collegeevent.KajalK11.College_event_management.model;

import jakarta.persistence.*;


import java.util.Objects;
@Entity
public class EventDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Column(name = "agenda", length = 255)
    private String agenda;

    @Column(name = "speaker", length = 100)
    private String speaker;

    @Column(name = "venue", length = 100)
    private String venue;

    @Column(name = "contact_info", length = 100)
    private String contactInfo;


    //empty constructor
    public EventDetail() {
    }

    // contractors with parameters

    public EventDetail(Long id, Long eventId, String agenda, String speaker, String venue, String contactInfo) {
        this.id = id;
        this.eventId = eventId;
        this.agenda = agenda;
        this.speaker = speaker;
        this.venue = venue;
        this.contactInfo = contactInfo;
    }

    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

@SuppressWarnings("unused")
public Long getEventId() {
    return eventId;
}

@SuppressWarnings("unused")
public void setEventId(Long eventId) {
    this.eventId = eventId;
}


@SuppressWarnings("unused")
public void getAgenda(Long eventId) {
    this.eventId = eventId;
}

@SuppressWarnings("unused")
public void setAgenda(Long eventId) {
    this.eventId = eventId;
}

@SuppressWarnings("unused")
public void getSpeaker(Long eventId) {
    this.eventId = eventId;
}

@SuppressWarnings("unused")
public void setSpeaker(Long eventId) {
    this.eventId = eventId;
}

@SuppressWarnings("unused")
public void getVenue(Long eventId) {
    this.eventId = eventId;
}

@SuppressWarnings("unused")
public void setVenue(Long eventId) {
    this.eventId = eventId;
}

@SuppressWarnings("unused")
public void getContactInfo(Long eventId) {
    this.eventId = eventId;
}

@SuppressWarnings("unused")
public void setContactInfo(Long eventId) {
    this.eventId = eventId;
}


    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EventDetail that = (EventDetail) o;
        return Objects.equals(id, that.id) && Objects.equals(eventId, that.eventId) && Objects.equals(agenda, that.agenda) && Objects.equals(speaker, that.speaker) && Objects.equals(venue, that.venue) && Objects.equals(contactInfo, that.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventId, agenda, speaker, venue, contactInfo);
    }

    //to string

    @Override
    public String toString() {
        return "EventDetail{" +
                "id=" + id +
                ", eventId=" + eventId +
                ", agenda='" + agenda + '\'' +
                ", speaker='" + speaker + '\'' +
                ", venue='" + venue + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
