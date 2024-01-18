package com.example.Proiect_Tehnologii_Web_Java.User.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proiect_Tehnologii_Web_Java.User.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { 
    User findUserByEmail(String email);
}
