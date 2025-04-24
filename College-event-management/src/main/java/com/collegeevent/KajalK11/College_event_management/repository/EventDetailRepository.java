package com.collegeevent.KajalK11.College_event_management.repository;


import com.collegeevent.KajalK11.College_event_management.model.EventDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDetailRepository extends JpaRepository<EventDetail, Long> {
}

