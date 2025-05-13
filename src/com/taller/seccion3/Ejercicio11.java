package com.taller.seccion3;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio11 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("naranja");
        
        Iterator<String> iterador = frutas.iterator();
        
        while (iterador.hasNext()) {
            String fruta = iterador.next();
            if (fruta.equals("pera")) {
                iterador.remove();
            }
        }
        
        System.out.println(frutas);
    }
}