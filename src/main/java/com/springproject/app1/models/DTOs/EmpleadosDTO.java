package com.springproject.app1.models.DTOs;

public class EmpleadosDTO {
    private String nombre, apellidos;
    private int edad, id;

    public EmpleadosDTO(String nombre, String apellidos, int edad, int id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.id= id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
