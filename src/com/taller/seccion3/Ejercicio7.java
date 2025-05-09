package com.taller.seccion3;

import java.util.HashSet;

public class Ejercicio7 {
    public static void main(String[] args) {
        HashSet<Double> numeros = new HashSet<>();
        
        numeros.add(1.5);
        numeros.add(2.7);
        numeros.add(1.5);
        
        System.out.println("Tamaño: " + numeros.size());
    }
}