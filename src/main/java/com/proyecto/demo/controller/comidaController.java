package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class comidaController {

    @GetMapping("/createComida/{id}")
        public String createComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Comida creada satisfactoriamente "+id;
        }

    @GetMapping("/createComida")
    public String createComida (){
        return "Comida creada satisfactoriamente";
    }

    @GetMapping("/readComida/{id}")
        public String readComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Comida encontrada satisfactoriamente "+id;
        }

    @GetMapping("/readComida")
    public String readComida(){
        return "Comida encontrada satisfactoriamente";
    }

    @GetMapping("/updateComida/{id}")
        public String updateComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Comida actualizada satisfactoriamente "+id;
        }

        @GetMapping("/updateComida")
    public String updateComida (){
        return "Comida actualizada satisfactoriamente";
    }

    @GetMapping("/deleteComida/{id}")
        public String deleteComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Comida eliminada satisfactoriamente "+id;
        }

    @GetMapping("/deleteComida")
    public String deleteComida(){
        return "Comida eliminada satisfactoriamente";
    }

}
