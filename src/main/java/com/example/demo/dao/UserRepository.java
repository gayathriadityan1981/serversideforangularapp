package com.example.demo.dao;

import com.example.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    
}