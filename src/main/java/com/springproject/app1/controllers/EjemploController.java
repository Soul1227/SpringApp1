package com.springproject.app1.controllers;

import com.springproject.app1.models.DTOs.EmpleadosDTO;
import com.springproject.app1.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model){

        //Empleados empleado = new Empleados("Paco","Ruiz","Calle de la piruleta","Parado",40,659874123,1);
        EmpleadosDTO empleado = new EmpleadosDTO("Ruben", "Pollito",25);
        model.addAttribute("empleado",empleado);

        return "detalles_info";
    }
}
