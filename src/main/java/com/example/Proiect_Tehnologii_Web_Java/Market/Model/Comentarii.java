package com.example.Proiect_Tehnologii_Web_Java.Market.Model;

import com.example.Proiect_Tehnologii_Web_Java.User.Models.User;

import org.springframework.beans.factory.annotation.Value;

import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Produse;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Comentarii")
public class Comentarii {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long Id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Produse produs;

    private String Text;

    private long Stele;

    
    private long Likes;

    public Comentarii() {
    }


    public Comentarii(long Id, User User, Produse Produs, String Text, long Stele, long Likes) {
        this.Id = Id;
        this.user = User;
        this.produs = Produs;
        this.Text = Text;
        this.Stele = Stele;
        this.Likes=Likes;
    }


    public long getId() {
        return this.Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User User) {
        this.user = User;
    }

    public Produse getProdus() {
        return this.produs;
    }

    public void setProdus(Produse Produs) {
        this.produs = Produs;
    }

    public String getText() {
        return this.Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public long getStele() {
        return this.Stele;
    }

    public void setStele(long Stele) {
        this.Stele = Stele;
    }


    public long getLikes() {
        return this.Likes;
    }

    public void setLikes(long Likes) {
        this.Likes = Likes;
    }
    

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", User='" + getUser() + "'" +
            ", Produs='" + getProdus() + "'" +
            ", Text='" + getText() + "'" +
            ", Stele='" + getStele() + "'" +
            ", Likes='" + getLikes() + "'" +
            "}";
    }
  
   
     
}
