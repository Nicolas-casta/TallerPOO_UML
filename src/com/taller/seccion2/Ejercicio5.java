package com.taller.seccion2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        
        System.out.println("Ingrese números (0 para terminar):");
        
        while ((numero = scanner.nextInt()) != 0) {
            suma += numero;
        }
        
        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}