package com.taller.seccion4;

public class Ejercicio4 {
    private String nombre;
    private int edad;
    
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
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }
    
    public static void main(String[] args) {
        Ejercicio4 persona = new Ejercicio4();
        persona.setNombre("Ana");
        persona.setEdad(25);
        persona.presentarse();
    }
}