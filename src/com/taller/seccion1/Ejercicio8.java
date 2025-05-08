package com.taller.seccion1;

public class Ejercicio8 {
    public static void main(String[] args) {
        String texto = "abc";
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un número");
        }
    }
}