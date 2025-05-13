package com.taller.seccion4;

public class Ejercicio2 {
    private String nombre;
    private int edad;
    
    public Ejercicio2() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
    
    public Ejercicio2(String nombre, int edad) {
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
    
    public static void main(String[] args) {
        Ejercicio2 persona1 = new Ejercicio2();
        Ejercicio2 persona2 = new Ejercicio2("Ana", 25);
        
        System.out.println("Persona 1: " + persona1.getNombre() + ", " + persona1.getEdad());
        System.out.println("Persona 2: " + persona2.getNombre() + ", " + persona2.getEdad());
    }
}