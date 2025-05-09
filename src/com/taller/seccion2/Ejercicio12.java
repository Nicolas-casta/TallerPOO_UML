package com.taller.seccion2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio12 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Diana");
        nombres.add("Bernardo");
        
        Collections.sort(nombres);
        System.out.println(nombres);
    }
}