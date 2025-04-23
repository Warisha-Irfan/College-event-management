package com.collegeevent.KajalK11.College_event_management.service;


import com.collegeevent.KajalK11.College_event_management.model.User;
import com.collegeevent.KajalK11.College_event_management.repository.UserImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private final UserImple userImple;

    public User login(String email, String password) {
        return userImple.findByEmailAndPassword(email, password);
    }

    public UserService(UserImple userImple) {
        this.userImple = userImple;
    }
    public User createUser(User user){
        return userImple.save(user);
    }
    public User getUserById(Long id){
        return  userImple.findById(id).orElse(null);
    }
    public List<User> getAllUsers(){
        return userImple.findAll();
    }

    public void  deleteUser(Long id){
        userImple.deleteById(id);
    }

    public User updateUser(Long id, User updatedUser){
        Optional<User> userOptional = userImple.findById(id);
        if(userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            user.setRole(updatedUser.getRole());
            return userImple.save(user);
        }
        return null;


    }
}
