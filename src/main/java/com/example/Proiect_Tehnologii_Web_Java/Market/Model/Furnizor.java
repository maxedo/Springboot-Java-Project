package com.example.Proiect_Tehnologii_Web_Java.Market.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Furnizor")
public class Furnizor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long Id;
    
    private String Nume;

    public Furnizor(){};

    public Furnizor(long Id, String Nume) {
        this.Id = Id;
        this.Nume = Nume;
    }


    public long getId() {
        return this.Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNume() {
        return this.Nume;
    }

    public void setNume(String Nume) {
        this.Nume = Nume;
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Nume='" + getNume() + "'" +
            "}";
    }

    
}
