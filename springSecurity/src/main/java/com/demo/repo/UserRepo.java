package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

    public Users findByUsername(String username);
 
    

}
