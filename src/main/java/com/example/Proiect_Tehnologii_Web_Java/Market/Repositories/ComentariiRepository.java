package com.example.Proiect_Tehnologii_Web_Java.Market.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Comentarii;
import java.util.List;


@Repository
public interface ComentariiRepository extends JpaRepository<Comentarii, Long> {
    
    @Query("select e from Comentarii e where e.produs.id = :id")
    List<Comentarii> getComentarii(@Param("id")Long id);

    @Modifying
    @Query("update Comentarii c set c.Likes = c.Likes + 1 where c.produs.id = :id")
    void upLike(@Param("id")Long id);

    @Modifying
    @Query("update Comentarii c set c.Likes = c.Likes - 1 where c.produs.id = :id")
    void downLike(@Param("id")Long id);


    @Modifying
    @Query(value = "INSERT INTO Comentarii (text, stele, produs_id, user_id,likes) VALUES (:text, :stele, :produsId, :userId, 0)", nativeQuery = true)
    void addComentariu(@Param("text") String text, @Param("stele") long stele, @Param("produsId") long produsId, @Param("userId") long userId);


}
