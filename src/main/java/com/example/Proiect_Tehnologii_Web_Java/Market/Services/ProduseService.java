package com.example.Proiect_Tehnologii_Web_Java.Market.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Produse;
import com.example.Proiect_Tehnologii_Web_Java.Market.Repositories.ProduseRepository;

import jakarta.transaction.Transactional;

@Service
public class ProduseService {
    

    @Autowired
    private ProduseRepository produseRepository;


    public ProduseService( ProduseRepository produseRepository) {
        this.produseRepository = produseRepository;
    }
    
    public List<Produse> getProduse(){
        return produseRepository.getProduse();
    }

    public List<Produse> getProdus(String Nume){
        return produseRepository.getProdus(Nume);
    }

    public void addProdus(Produse produs){
        produseRepository.save(produs);
    }

    @Transactional
    public void redenumireProdus( String Nume,Long Id){
        produseRepository.redenumireProdus(Nume, Id);
    }

    public void stergereProdus(Long Id){
        produseRepository.deleteById(Id);
    }

    public List<Produse> searchByFurnizor(Long Id){
        return produseRepository.searchByFurnizor(Id);
    }

    public List<Produse> searchByTaraDeProductie(Long Id){
        return produseRepository.searchByTaraDeProductie(Id);
    }

    public List<Produse> searchByProducator(Long Id){
        return produseRepository.searchByProducator(Id);
    }


}
