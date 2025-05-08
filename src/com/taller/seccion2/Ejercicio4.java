package com.taller.seccion2;

public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + "! = " + factorial);
        }
    }
}