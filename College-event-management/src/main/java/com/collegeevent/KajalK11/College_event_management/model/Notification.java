package com.collegeevent.KajalK11.College_event_management.model;

import java.util.Date;
import java.util.Objects;

public class Notification {
    private Long id;
    private Long userId;
    private String content;
    private Date timestamp;
    private boolean isRead;

    // empty constructor

    public Notification() {
    }

    //constructor with parameters

    public Notification(Long id, Long userId, String content, Date timestamp, boolean isRead) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
        this.isRead = isRead;
    }

    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return isRead == that.isRead && Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(content, that.content) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, content, timestamp, isRead);
    }

    //to string

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", isRead=" + isRead +
                '}';
    }
}
