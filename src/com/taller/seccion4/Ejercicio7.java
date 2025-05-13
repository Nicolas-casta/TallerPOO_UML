package com.taller.seccion4;

public class Ejercicio7 {
    private String nombre;
    private int edad;
    private static int contador = 0;
    
    public Ejercicio7() {
        contador++;
    }
    
    public static int getContador() {
        return contador;
    }
    
    public static void main(String[] args) {
        Ejercicio7 p1 = new Ejercicio7();
        Ejercicio7 p2 = new Ejercicio7();
        System.out.println("Instancias creadas: " + Ejercicio7.getContador());
    }
}