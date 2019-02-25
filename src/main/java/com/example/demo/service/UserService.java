package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService{

    @Autowired
    UserDao userDao;
    
    public List<User> getAllUsers(){
       
        List<User> users=userDao.findUsers();
        return users;
    }

     public User findUser(int id){
        System.out.println("ctrl comes to findUser----"+id);
         User user=userDao.findUser(id);
         return user;  
     }
    
        public void deleteUser(int id){
            userDao.delUser(id);
        }
    
        public void saveUser(User user){
            userDao.saveUser(user);
        }
    }