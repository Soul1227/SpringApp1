package com.springproject.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model){
        model.addAttribute("Titulo","Servidor en Linea");
        model.addAttribute("Servidor", "infortamica");
        model.addAttribute("IP","458.652.36.152");
        return "detalles_info";
    }
}
