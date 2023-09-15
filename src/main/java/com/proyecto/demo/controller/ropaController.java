package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ropaController {

    @GetMapping("/createRopa")
    public String createRopa (){
        return "Ropa creada satisfactoriamente";
    }

    @GetMapping("/readRopa")
    public String readRopa(){
        return "Ropa encontrada satisfactoriamente";
    }
        @GetMapping("/updateRopa")
    public String updateRopa (){
        return "Ropa actualizada satisfactoriamente";
    }

    @GetMapping("/delateRopa")
    public String delateRopa(){
        return "Ropa eliminada satisfactoriamente";
    }

}
