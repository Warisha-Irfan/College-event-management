package com.collegeevent.KajalK11.College_event_management.controller;

import com.collegeevent.KajalK11.College_event_management.model.User;
import com.collegeevent.KajalK11.College_event_management.repository.UserImple;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UserImple userRepository;

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            HttpSession session,
                            Model model){
        User user   = userRepository.findByEmailAndPassword(email, password)
    }
}
