package com.example.Proiect_Tehnologii_Web_Java.Market.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Comentarii;
import com.example.Proiect_Tehnologii_Web_Java.Market.POJO.ComentariiDTO;
import com.example.Proiect_Tehnologii_Web_Java.Market.Repositories.ComentariiRepository;
import com.example.Proiect_Tehnologii_Web_Java.Market.Repositories.ProduseRepository;
import com.example.Proiect_Tehnologii_Web_Java.User.Repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class ComentariiService {
    @Autowired
    private ComentariiRepository comentariiRepository;


    public ComentariiService(ComentariiRepository comentariiRepository,ProduseRepository produseRepository, UserRepository userRepository) {
        this.comentariiRepository = comentariiRepository;
    }

    public List<Comentarii> getComentarii(Long Id){
        return comentariiRepository.getComentarii(Id);
    }

    @Transactional
    public void addComentariu(Comentarii comentarii, Long User_Id, Long Id_Produs){
        comentariiRepository.addComentariu(comentarii.getText(),comentarii.getStele(),Id_Produs,User_Id);
    }
    @Transactional
    public void upComentarii( Long id){
        comentariiRepository.upLike(id);
    }
    @Transactional
    public void downComentarii( Long Id){
        comentariiRepository.downLike(Id);
    }

    public void deleteComentariu( Long Id){
        comentariiRepository.deleteById(Id);
    }
    

    private ComentariiDTO convertToDTO(Comentarii comentarii) {
    return new ComentariiDTO(comentarii.getId(), comentarii.getText(), comentarii.getStele(), comentarii.getLikes());
}


}
