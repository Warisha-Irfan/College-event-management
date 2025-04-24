package com.collegeevent.KajalK11.College_event_management.service;


import com.collegeevent.KajalK11.College_event_management.model.User;
import com.collegeevent.KajalK11.College_event_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public User login(String email, String password,String role) {
        return userRepository.findByEmailAndPasswordAndRole(email, password,role);
    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public User getUserById(Long id){
        return  userRepository.findById(id).orElse(null);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void  deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User updatedUser){
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            user.setRole(updatedUser.getRole());
            return userRepository.save(user);
        }
        return null;


    }
}
