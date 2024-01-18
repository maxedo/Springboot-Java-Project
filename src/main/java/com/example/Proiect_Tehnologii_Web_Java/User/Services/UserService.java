package com.example.Proiect_Tehnologii_Web_Java.User.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proiect_Tehnologii_Web_Java.User.Models.User;
import com.example.Proiect_Tehnologii_Web_Java.User.Models.UserResponse;
import com.example.Proiect_Tehnologii_Web_Java.User.Repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User SignUp(User user){
        return userRepository.save(user);
    }

  
    public String Login(User user){
        User storedUser=userRepository.findUserByEmail(user.getEmail());
        if(user.getPassword().equals(storedUser.getPassword()))
            return "Utilizatorul a fost autentificat cu succes";
        return null;
    }
   


}
