package com.taller.seccion2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio13 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("manzana");
        lista.add("pera");
        lista.add("manzana");
        lista.add("naranja");
        lista.add("pera");
        
        Set<String> sinDuplicados = new HashSet<>(lista);
        System.out.println(sinDuplicados);
    }
}