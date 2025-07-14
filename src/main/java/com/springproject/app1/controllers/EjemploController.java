package com.springproject.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String getMethodName(){
        return "detalles_info";
    }
}
