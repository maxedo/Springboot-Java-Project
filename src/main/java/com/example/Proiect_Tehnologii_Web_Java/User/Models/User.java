package com.example.Proiect_Tehnologii_Web_Java.User.Models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long Id;

    @Column
    private String nickname;
    @Column
    private String email;
    @Column
    private String password;


    public User(){}

    public User(String Nickname, String Email, String Password) {
        this.nickname = Nickname;
        this.email = Email;
        this.password = Password;
    }

    public long getId() {
        return this.Id;
    }

    public void setId(Long Id){
        this.Id=Id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String Nickname) {
        this.nickname = Nickname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }


     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id == user.Id && Objects.equals(email, user.password) && Objects.equals(password, user.password);
    }


    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Nickname='" + getNickname() + "'" +
            ", Email='" + getEmail() + "'" +
            ", Password='" + getPassword() + "'" +
            "}";
    }
    

}
