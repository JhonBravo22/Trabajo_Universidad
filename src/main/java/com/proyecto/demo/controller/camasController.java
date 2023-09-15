package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class camasController {

    @GetMapping("/createCamas/{id}")
        public String createCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Cama creada satisfactoriamente "+id;
        }

    @GetMapping("/createCamas")
    public String createCamas (){
        return "Cama creada satisfactoriamente";
    }

    @GetMapping("/readCamas/{id}")
        public String readCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Cama encontrada satisfactoriamente "+id;
        }

    @GetMapping("/readCamas")
    public String readCamas(){
        return "Cama encontrada satisfactoriamente";
    }

    @GetMapping("/updateCamas/{id}")
        public String updateCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Cama actualizada satisfactoriamente "+id;
        }
        
        @GetMapping("/updateCamas")
    public String updateCamas (){
        return "Cama actualizada satisfactoriamente";
    }

    @GetMapping("/delateCamas/{id}")
        public String delateCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Cama eliminada satisfactoriamente "+id;
        }

    @GetMapping("/delateCamas")
    public String delateCamas(){
        return "Cama eliminada satisfactoriamente";
    }

}
