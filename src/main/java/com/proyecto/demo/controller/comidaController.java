package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class comidaController {

    @GetMapping("/createComida")
    public String createComida (){
        return "Comida creada satisfactoriamente";
    }

    @GetMapping("/readComida")
    public String readComida(){
        return "Comida encontrada satisfactoriamente";
    }
        @GetMapping("/updateComida")
    public String updateComida (){
        return "Comida actualizada satisfactoriamente";
    }

    @GetMapping("/delateComida")
    public String delateComida(){
        return "Comida eliminada satisfactoriamente";
    }

}
