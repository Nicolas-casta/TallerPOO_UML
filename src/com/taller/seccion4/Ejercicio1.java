package com.taller.seccion4;

public class Ejercicio1 {
    private String nombre;
    private int edad;
    
    public Ejercicio1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}