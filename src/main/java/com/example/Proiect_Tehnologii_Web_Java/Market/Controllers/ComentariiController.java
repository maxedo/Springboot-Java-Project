package com.example.Proiect_Tehnologii_Web_Java.Market.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Comentarii;
import com.example.Proiect_Tehnologii_Web_Java.Market.Services.ComentariiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/Produse")
public class ComentariiController {
    @Autowired
    private ComentariiService comentariiService;
    
    public ComentariiController(ComentariiService comentariiService){
        this.comentariiService=comentariiService;
    }

    @GetMapping("/comentarii/{Id}")
    public ResponseEntity<List<Comentarii>> getComentarii(@PathVariable Long Id) {
        return ResponseEntity.ok(comentariiService.getComentarii(Id));
    }

    @PostMapping("/comentarii/{Id_User}/{Id_Produs}")
    public ResponseEntity<String> addComentarii(@PathVariable Long Id_User,@PathVariable Long Id_Produs, @RequestBody Comentarii comentariu) {
        comentariiService.addComentariu(comentariu, Id_User,Id_Produs);     
        return ResponseEntity.ok("Comentariul a fost adaugat cu succes");
    }

    @PutMapping("/comentariiUp/{Id_Comentariu}")
    public ResponseEntity<String> comentariiUp(@PathVariable Long Id_Comentariu) {
        comentariiService.upComentarii(Id_Comentariu);
        return ResponseEntity.ok("Comentariul a fost apreciat");
    }

    @PutMapping("/comentariiDown/{Id_Comentariu}")
    public ResponseEntity<String> comentariiDown(@PathVariable Long Id_Comentariu) {
        comentariiService.downComentarii(Id_Comentariu);
        return ResponseEntity.ok("Comentariul a fost dezaprobat");
    }


    @DeleteMapping("/comentarii/{Id_Comentariu}")
    public ResponseEntity<String> deleteComentariu(@PathVariable Long Id_Comentariu){
        comentariiService.deleteComentariu(Id_Comentariu);
        return ResponseEntity.ok("Comentariul a fost sters cu succes");
    }
    
    

    

}
