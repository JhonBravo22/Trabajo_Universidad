package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class juguetesController {

    @GetMapping("/createJuguetes")
    public String createJuguetes (){
        return "Juguete creado satisfactoriamente";
    }

    @GetMapping("/readJuguetes")
    public String readJuguetes(){
        return "Juguete encontrado satisfactoriamente";
    }
        @GetMapping("/updateJuguetes")
    public String updateJuguetes (){
        return "Juguete actualizado satisfactoriamente";
    }

    @GetMapping("/delateJuguetes")
    public String delateJuguetes(){
        return "Juguete eliminada satisfactoriamente";
    }

}
