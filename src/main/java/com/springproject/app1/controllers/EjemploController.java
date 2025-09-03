package com.springproject.app1.controllers;

import com.springproject.app1.models.DTOs.EmpleadosDTO;
import com.springproject.app1.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {

        //Empleados empleado = new Empleados("Paco","Ruiz","Calle de la piruleta","Parado",40,659874123,1);
        EmpleadosDTO empleado = new EmpleadosDTO(null, "Pollito", 25);
        model.addAttribute("empleado", empleado);

        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> listaEmpleados() {
        return Arrays.asList(new Empleados("Paco", "Ruiz", "Calle de la piruleta", "Parado", 40, 478521653, 1),
                new Empleados("Julia", "Benitez", "Calle Galleta", "Activa", 36, 874569123, 2),
                new Empleados("Andrea", "Tamizo", "Calle Golosina", "Activa", 45, 852741963, 3),
                new Empleados("Antonio", "Caprizo", "Calle Chocolate", "Parado", 34, 789456123, 4)
        );
    }
}
