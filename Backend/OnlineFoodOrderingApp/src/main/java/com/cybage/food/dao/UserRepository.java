package com.cybage.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.food.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}