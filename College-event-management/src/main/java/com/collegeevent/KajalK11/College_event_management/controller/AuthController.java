package com.collegeevent.KajalK11.College_event_management.controller;

import com.collegeevent.KajalK11.College_event_management.model.User;
import com.collegeevent.KajalK11.College_event_management.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        @RequestParam String role,
                        HttpSession session,
                        Model model) {

        // Make sure role matches DB case (like "ADMIN", "FACULTY", "STUDENT")
        String formattedRole = role.toUpperCase();

        System.out.println("Trying to log in with:");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Role: " + formattedRole);

        User user = userRepository.findByEmailAndPasswordAndRole(email, password, formattedRole);

        if (user != null) {
            session.setAttribute("CurrentUser", user);
            System.out.println("Login successful for role: " + user.getRole());

            switch (formattedRole) {
                case "STUDENT":
                    return "redirect:/student/dashboard";
                case "FACULTY":
                    return "redirect:/faculty/dashboard";
                case "ADMIN":
                    return "redirect:/admin/dashboard";
                default:
                    model.addAttribute("error", "Invalid role.");
                    return "login";
            }
        } else {
            System.out.println("Login failed.");
            model.addAttribute("error", "Invalid email or password.");
            return "login";
        }
    }
}