package com.taller.seccion2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clave = "123";
        
        do {
            System.out.print("Clave: ");
        } while (!scanner.nextLine().equals(clave));
        
        System.out.println("¡Correcto!");
        scanner.close();
    }
}