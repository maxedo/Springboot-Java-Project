package com.example.Proiect_Tehnologii_Web_Java.Market.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Produse")
public class Produse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;

    private String nume;

    @ManyToOne
    private Furnizor furnizor;

    
    @ManyToOne
    private Producatori producator;

    
    @ManyToOne
    private Locatie tara_de_productie;

    private long Pret;

    private long Stele;

    @OneToMany(mappedBy = "produs",cascade = CascadeType.ALL)
    private List<Comentarii> Comentarii;

    public Produse(){};


    public Produse(long Id, String Nume, Furnizor Furnizor, Producatori producator, Locatie tara_de_productie, long Pret, long Stele, List<Comentarii> Comentarii) {
        this.id = Id;
        this.nume = Nume;
        this.furnizor = Furnizor;
        this.producator = producator;
        this.tara_de_productie = tara_de_productie;
        this.Pret = Pret;
        this.Stele = Stele;
        this.Comentarii = Comentarii;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long Id) {
        this.id = Id;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String Nume) {
        this.nume = Nume;
    }

    public Furnizor getFurnizor() {
        return this.furnizor;
    }

    public void setFurnizor(Furnizor Furnizor) {
        this.furnizor = Furnizor;
    }

    public Producatori getProducator() {
        return this.producator;
    }

    public void setProducator(Producatori producator) {
        this.producator = producator;
    }

    public Locatie getTara_de_productie() {
        return this.tara_de_productie;
    }

    public void setTara_de_productie(Locatie tara_de_productie) {
        this.tara_de_productie = tara_de_productie;
    }

    public long getPret() {
        return this.Pret;
    }

    public void setPret(long Pret) {
        this.Pret = Pret;
    }

    public long getStele() {
        return this.Stele;
    }

    public void setStele(long Stele) {
        this.Stele = Stele;
    }

    public List<Comentarii> getComentarii() {
        return this.Comentarii;
    }

    public void setComentarii(List<Comentarii> Comentarii) {
        this.Comentarii = Comentarii;
    }



    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Nume='" + getNume() + "'" +
            ", Furnizor='" + getFurnizor() + "'" +
            ", producator='" + getProducator() + "'" +
            ", tara_de_productie='" + getTara_de_productie() + "'" +
            ", Pret='" + getPret() + "'" +
            ", Stele='" + getStele() + "'" +
            ", Comentarii='" + getComentarii() + "'" +
            "}";
    }




}
