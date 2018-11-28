package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping(value = "/all")
    public List<User> findAllUser(){
        return userDao.findAll();
    }

    @GetMapping(value = "/find/{id}")
    public User findOneUser(Integer id){
        return userDao.getOne(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteUser(Integer id){
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
