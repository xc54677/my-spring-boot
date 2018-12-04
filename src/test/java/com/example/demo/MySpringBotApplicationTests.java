package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.MyUserService;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBotApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Resource
	private MyUserService userService;

	@Test
	public void testRepository(){
		User user = userService.findByNameAndPassword("bo","12345");
		System.out.println("findByNameAndPassword: " + user.getId() + ": " + user.getName());

	}

}
