package com.springproject.app1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/info")
    public Map<String, Object> info(){
        Map<String, Object> map = new HashMap<>();
        map.put("Titulo","Servidor en Linea");
        map.put("Servidor", "infortamica");
        map.put("IP","458.652.36.152");
        return map;
    }
}