package com.springproject.app1.controllers;

import com.springproject.app1.models.DTOs.EmpleadosDTO;
import com.springproject.app1.models.Empleados;
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
        //Empleados empleado = new Empleados("Paco","Ruiz","Calle de la piruleta","Parado",40,659874123,1);
        EmpleadosDTO empleadoDTO = new EmpleadosDTO("Ruben", "Pollito",25);
        Map<String, Object> map = new HashMap<>();
        map.put("empleado",empleadoDTO);
        return map;
    }
}