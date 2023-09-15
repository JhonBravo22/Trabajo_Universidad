package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class camasController {

    @GetMapping("/createCama")
    public String createCama (){
        return "Cama creada satisfactoriamente";
    }

    @GetMapping("/readCama")
    public String readCama(){
        return "Cama encontrada satisfactoriamente";
    }
        @GetMapping("/updateCama")
    public String updateCama (){
        return "Cama actualizada satisfactoriamente";
    }

    @GetMapping("/delateCama")
    public String delateCama(){
        return "Cama eliminada satisfactoriamente";
    }

}
