package com.example.demo.service;

import com.example.demo.model.User;

public interface MyUserService {
    User findByNameAndPassword(String name, String password);
}
