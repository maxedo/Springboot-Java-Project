package com.example.Proiect_Tehnologii_Web_Java.Market.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Produse;

@Repository
public interface ProduseRepository extends JpaRepository<Produse, Long>{

      @Query("select p from Produse p order by RAND()")
    List<Produse> getProduse();

    @Query("select p from Produse p where p.nume = ?1")
    List<Produse> getProdus(String nume);

    @Query("select p from Produse p where p.furnizor.id = :id")
    List<Produse> searchByFurnizor(@Param("id")Long Id);

    @Query("select p from Produse p where p.tara_de_productie.id = :id")
    List<Produse> searchByTaraDeProductie(@Param("id")Long Id);

    @Query("select p from Produse p where p.producator.id = :id")
    List<Produse> searchByProducator(@Param("id")Long id);

    @Modifying
    @Query("update Produse p set p.nume = :nume where p.id = :id")
    void redenumireProdus(@Param("nume") String nume,@Param("id") Long id);

}
