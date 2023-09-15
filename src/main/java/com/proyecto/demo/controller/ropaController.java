package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ropaController {

    @GetMapping("/createRopa/{id}")
        public String createRopa(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Ropa creada satisfactoriamente "+id;
        }

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

    @GetMapping("/deleteRopa")
    public String deleteRopa(){
        return "Ropa eliminada satisfactoriamente";
    }

}
