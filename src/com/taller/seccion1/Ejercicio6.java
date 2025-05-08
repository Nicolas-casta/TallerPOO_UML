package com.taller.seccion1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("INGRESA UN NUMERO ENTERO: ");
		int num = scanner.nextInt();
		System.out.println("EL NUMERO ENTERO ES: " + num);

		System.out.println("INGRESA UN DECIMAL: ");
		double decimal = scanner.nextDouble();
		System.out.println("EL DECIMAL ES: " + decimal);

		scanner.close();
	}
}
