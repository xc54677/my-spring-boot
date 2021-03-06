package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserDao;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    @GetMapping(value = "/all")
    public List<User> findAllUser(){
        return userDao.findAll();
    }

    @GetMapping(value = "/find")
    public User findOneUser(@RequestParam String id){
        return userDao.getOne(id);
    }

    @DeleteMapping(value = "/delete")
    public void deleteUser(@RequestParam String id){
        userDao.deleteById(id);
    }

    @PostMapping(value = "/add")
    public void addUser(User user){
        userDao.save(user);
    }

    @PutMapping(value = "/update")
    public void updateUser(User user){
        userDao.save(user);
    }




}
