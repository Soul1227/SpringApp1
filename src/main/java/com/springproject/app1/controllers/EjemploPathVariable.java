package com.springproject.app1.controllers;

import com.springproject.app1.models.DTOs.EmpleadosDTO;
import com.springproject.app1.models.Empleados;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/variable")
public class EjemploPathVariable {
    @GetMapping("/id/{id}")
    public EmpleadosDTO buscarEmpleadoId(@PathVariable int id) {
        EmpleadosDTO empleadosDTO = new EmpleadosDTO("Paco", "Canelo", 25, id);
        return empleadosDTO;
    }

    @PostMapping("/solicitud")
    public Empleados crearEmpleados(@RequestBody Empleados empleados){
        System.out.println(empleados.getNombre());
        System.out.println(empleados.getApellidos());
        System.out.println(empleados.getDireccion());
        System.out.println(empleados.getPuesto());
        System.out.println(empleados.getTelefono());
        System.out.println(empleados.getId());
        return empleados;
    }
}
