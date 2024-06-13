package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("etudiant")
public class EtudiantController {

    @PostMapping("enregistrer")
    public String saveEtudiant(@RequestBody String param) {
        String resulat = param.equalsIgnoreCase("edem") ? "cool" : "Vous êtes pas le bienvenu";
        return resulat;
    }
}
