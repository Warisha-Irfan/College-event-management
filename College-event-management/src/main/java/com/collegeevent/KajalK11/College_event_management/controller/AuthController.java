package com.collegeevent.KajalK11.College_event_management.controller;

import com.collegeevent.KajalK11.College_event_management.model.User;
import com.collegeevent.KajalK11.College_event_management.repository.UserImple;
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
    private UserImple userImple;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
@PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            @RequestParam String role,
                            HttpSession session,
                            Model model) {
        User user = userImple.findByEmailAndPasswordAndRole(email, password,role);

        if (user != null) {
            session.setAttribute("CurrentUser", user);

            switch (user.getRole().toUpperCase()) {
                case "STUDENT":
                    return "redirect:/student/dashboard";
                case "FACULTY":
                    return "redirect:/faculty/dashboard";
                case "ADMIN":
                    return "redirect:/admin/dashboard";
                default:
                    model.addAttribute("error", "Invaild role.");
                    return "login";

            }
        } else {
            model.addAttribute("error", "Invalid email or password.");
            return "login";
        }
    }
}

