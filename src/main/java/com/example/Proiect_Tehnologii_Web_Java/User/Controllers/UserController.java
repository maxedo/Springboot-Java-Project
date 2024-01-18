package com.example.Proiect_Tehnologii_Web_Java.User.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.Proiect_Tehnologii_Web_Java.User.Models.User;
import com.example.Proiect_Tehnologii_Web_Java.User.Models.UserResponse;
import com.example.Proiect_Tehnologii_Web_Java.User.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }


    @PostMapping("/SignUp")    
    public ResponseEntity<String> SignUp(@RequestBody User user){
        userService.SignUp(user);
        return new ResponseEntity<>("Utilizatorul a fost creat cu succes", HttpStatus.CREATED);
    }

    @PostMapping("/Login")
    public ResponseEntity<String> Login(@RequestBody User user){
        return ResponseEntity.ok(userService.Login(user));
    }


}
