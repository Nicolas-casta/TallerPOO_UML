package com.taller.seccion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese números (0 para terminar):");
        int n;
        while ((n = scanner.nextInt()) != 0) {
            if (n % 2 == 0) {
                System.out.println("Par: " + n);
            }
        }
        scanner.close();
    }
}