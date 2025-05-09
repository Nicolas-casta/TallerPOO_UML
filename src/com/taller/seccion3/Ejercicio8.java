package com.taller.seccion3;

import java.util.HashMap;

public class Ejercicio8 {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();
        
        edades.put("Ana", 25);
        edades.put("Juan", 30);
        edades.put("María", 28);
        
        System.out.println(edades);
        System.out.println("Edad de Ana: " + edades.get("Ana"));
    }
}