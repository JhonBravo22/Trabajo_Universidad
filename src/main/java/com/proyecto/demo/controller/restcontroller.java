package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class restcontroller {

    @GetMapping("/createCamas")
    public String createCamas (){
        return "Cama adicionada satisfactoriamente";
    }

    @GetMapping("/readCama")
    public String readCama(){
        return "Cama eliminada";
    }
        @GetMapping("/updateCamas")
    public String updateCamas (){
        return "Cama adicionada satisfactoriamente";
    }

    @GetMapping("/delateCama")
    public String delateCama(){
        return "Cama eliminada";
    }

}
