package com.taller.seccion4;

public class Ejercicio3 {
    private int edad;
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    public static void main(String[] args) {
        Ejercicio3 persona = new Ejercicio3();
        persona.setEdad(25);
        System.out.println(persona.getEdad());
    }
}