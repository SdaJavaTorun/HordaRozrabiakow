package com.sdajava.Horda.service;

import com.sdajava.Horda.model.User;
import com.sdajava.Horda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void addUser(String firstName, String password, User.Role candidate) {
    }
}
