package com.home.user.service;

import com.home.user.model.User;
import com.home.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username,password);
    }
}