package com.taller.seccion3;

import java.util.ArrayList;

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        
        nombres.add("Ana");
        nombres.add("Juan");
        
        System.out.println("Antes: " + nombres);
        
        nombres.clear();
        
        System.out.println("Después: " + nombres);
    }
}