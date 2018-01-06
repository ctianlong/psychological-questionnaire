package com.tmy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmy.model.CountUser;

public interface CountUserRepository extends JpaRepository<CountUser, Integer> {
    
    CountUser findByUsername(String username);

}
