package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class aseoController {

    @GetMapping("/createAseo/{id}")
        public String createAseo(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Aseo creado satisfactoriamente "+id;
        }

    @GetMapping("/createAseo")
    public String createAseo (){
        return "aseo creado satisfactoriamente";
    }

    @GetMapping("/readAseo")
    public String readAseo(){
        return "aseo encontrado satisfactoriamente";
    }
        @GetMapping("/updateAseo")
    public String updateAseo (){
        return "Aseo actualizado satisfactoriamente";
    }

    @GetMapping("/deleteAseo")
    public String deleteAseo(){
        return "Aseo eliminado satisfactoriamente";
    }

}
