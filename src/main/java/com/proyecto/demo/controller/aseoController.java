package com.proyecto.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class aseoController {

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

    @GetMapping("/delateAseo")
    public String delateAseo(){
        return "Aseo eliminado satisfactoriamente";
    }

}
