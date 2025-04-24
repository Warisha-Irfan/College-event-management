package com.collegeevent.KajalK11.College_event_management.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String adminDashboard(HttpSession session) {
        if (session.getAttribute("CurrentUser") == null) {
            return "redirect:/login";
        }
        return "AdminDashboard"; // matches AdminDashboard.html
    }

}
