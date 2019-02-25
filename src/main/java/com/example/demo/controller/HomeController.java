package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/users")
class HomeController{

	
	@Autowired
    UserRepository userRepository;

    @RequestMapping(value="/getAllUsers")
    public List<User> getAllUser()
    {
        List<User> users=userRepository.findAll();
        System.out.println("-----------controller--------"+users);
        return users;
    }
    @RequestMapping(value="/getUser/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public  User getUser(@PathVariable("id") int id)
    {
        User user=userRepository.findById(id).orElse(null);
        System.out.println("-----------controller---getuser-----"+user);
        return user;
    }
    @RequestMapping(value="/saveUser", method = RequestMethod.POST)
    public  String getUser(User user)
    {
        userRepository.save(user);
        System.out.println("-----------controller---update-----"+user);
        return "success";
    }
}
