package com.taller.seccion3;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        numeros.remove(1);
        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}