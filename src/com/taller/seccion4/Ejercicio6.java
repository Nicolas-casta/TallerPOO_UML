package com.taller.seccion4;

public class Ejercicio6 {
    private String nombre;
    private int edad;
    
    public void setDatos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar() {
        System.out.println(this.nombre + ", " + this.edad);
    }
    
    public static void main(String[] args) {
        Ejercicio6 persona = new Ejercicio6();
        persona.setDatos("Ana", 25);
        persona.mostrar();
    }
}