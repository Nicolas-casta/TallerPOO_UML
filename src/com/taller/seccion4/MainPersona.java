package com.taller.seccion4;

public class MainPersona {
    public static void main(String[] args) {
        Ejercicio4 persona1 = new Ejercicio4();
        persona1.setNombre("Ana");
        persona1.setEdad(25);
        persona1.presentarse();
        
        Ejercicio4 persona2 = new Ejercicio4();
        persona2.setNombre("Luis");
        persona2.presentarse();
        
        Ejercicio4 persona3 = new Ejercicio4();
        persona3.setEdad(30);
        persona3.presentarse();
    }
}