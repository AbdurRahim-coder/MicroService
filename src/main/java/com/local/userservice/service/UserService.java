package com.local.userservice.service;

import com.local.userservice.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();
    User getUser(String userId);
}
