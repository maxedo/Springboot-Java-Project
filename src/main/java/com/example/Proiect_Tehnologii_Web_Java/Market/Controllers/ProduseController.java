package com.example.Proiect_Tehnologii_Web_Java.Market.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proiect_Tehnologii_Web_Java.Market.Model.Produse;
import com.example.Proiect_Tehnologii_Web_Java.Market.Services.ProduseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/Produse")
public class ProduseController {
    @Autowired
    private ProduseService produseService;


    public ProduseController(ProduseService produseService) {
        this.produseService = produseService;
    }

    @PostMapping("/produs")
    public ResponseEntity<String> addProdus(@RequestBody Produse produs) {
        produseService.addProdus(produs);
        return ResponseEntity.ok("Produsul a fost adaugat cu succes");
    }

    @DeleteMapping("/produs/{Id}")
    public ResponseEntity<String> stergereProdus(@PathVariable Long Id){
        produseService.stergereProdus(Id);
        return ResponseEntity.ok("Produsul a fost sters cu succes");
    }

    @PutMapping("path/{id}")
    public ResponseEntity<String> redenumireProdus(@PathVariable Long id, @RequestBody String Nume) {
        produseService.redenumireProdus(Nume, id);
        return ResponseEntity.ok("Produsul a fost redenumit cu succes");
    }
    

    @GetMapping("/feed")
    public ResponseEntity<List<Produse>> getProduse() {
        return ResponseEntity.ok(produseService.getProduse());
    }

    @GetMapping("/produs/{Nume}")
    public ResponseEntity<List<Produse>> cautareProdus(@PathVariable String Nume) {
        return ResponseEntity.ok(produseService.getProdus(Nume));
    }


    @GetMapping("/produsFurnizor/{Id_Furnizor}")
    public ResponseEntity<List<Produse>> searchByFurnizor(@PathVariable Long Id_Furnizor) {
        return ResponseEntity.ok(produseService.searchByFurnizor(Id_Furnizor));
    }
    
    @GetMapping("/produsProducator/{Id_Producator}")
    public ResponseEntity<List<Produse>> searchByProducator(@PathVariable Long Id_Producator) {
        return ResponseEntity.ok(produseService.searchByProducator(Id_Producator));
    }

    @GetMapping("/produsTaraDeProductie/{Id_TaraDeProductie}")
    public ResponseEntity<List<Produse>> searchByTaraDeProductie(@PathVariable Long Id_TaraDeProductie) {
        return ResponseEntity.ok(produseService.searchByTaraDeProductie(Id_TaraDeProductie));
    }
    


    
}
