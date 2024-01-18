package com.example.Proiect_Tehnologii_Web_Java.Market.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Producatori;


@Repository
public interface ProducatoriRepository extends JpaRepository<Producatori, Long>{
    
}
