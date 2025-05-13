package com.taller.seccion3;

import java.util.ArrayList;

public class Ejercicio13 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("naranja");
        
        boolean tieneManzana = frutas.contains("manzana");
        boolean tienePlatano = frutas.contains("platano");
        
        System.out.println("¿Tiene manzana? " + tieneManzana);
        System.out.println("¿Tiene plátano? " + tienePlatano);
    }
}