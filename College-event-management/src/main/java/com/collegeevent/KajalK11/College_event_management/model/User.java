package com.collegeevent.KajalK11.College_event_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
@Table(name ="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message ="User name is required.")
    @Size(min = 4, max = 50, message =" user name must be 4 to 50 characters.")
    @Column(nullable = false)
    private String name;

    @NotBlank( message =" user email is required.")
    @Email(message ="Enter a valid email address")
    @Column(nullable = false)
    private String email;

    @NotBlank(message ="Password is required")
    @Size(min = 6, message="Password must be at least 6 characters long.")
    @Column(nullable = false)
    private String password;

    @NotBlank(message="role is required")
    @Column(nullable = false)
    private String role;

    // empty constructor
    public User() {
    }

    //constructor with conditions
    public User(Long id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // getter setter methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id)
                && Objects.equals(name, user.name)
                && Objects.equals(email, user.email)
                && Objects.equals(password, user.password)
                && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {

        int result = Long.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(password);
        result = 31 * result + Objects.hashCode(role);
        return result;

    }

    // to string

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
