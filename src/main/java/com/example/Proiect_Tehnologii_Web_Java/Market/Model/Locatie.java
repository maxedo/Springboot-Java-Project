package com.example.Proiect_Tehnologii_Web_Java.Market.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Locatie")
public class Locatie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long Id;

    private String Nume;

    private String Continent;


    public Locatie() {
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

    public String getContinent() {
        return this.Continent;
    }

    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    public Locatie( String Nume, String Continent) {
        this.Nume = Nume;
        this.Continent = Continent;
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Nume='" + getNume() + "'" +
            ", Continent='" + getContinent() + "'" +
            "}";
    }


}
