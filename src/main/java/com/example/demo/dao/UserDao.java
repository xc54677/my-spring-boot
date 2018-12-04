package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component(value = "userDao")
public interface UserDao {
    User findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
