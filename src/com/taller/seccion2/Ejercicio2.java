package com.taller.seccion2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int edad = 25;
        
        if (edad <= 12) {
            System.out.println("Es un niño");
        } else if (edad <= 17) {
            System.out.println("Es un adolescente");
        } else if (edad <= 60) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un anciano");
        }
    }
}