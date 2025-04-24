package com.collegeevent.KajalK11.College_event_management.repository;

import com.collegeevent.KajalK11.College_event_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  JpaRepository<User, Long> {

    User findByEmailAndPasswordAndRole(String email, String password,String role);

}
