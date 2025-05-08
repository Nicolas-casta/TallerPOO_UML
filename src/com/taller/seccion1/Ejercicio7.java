package com.taller.seccion1;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		String numeroTexto = "123";

		int numeroEntero = Integer.parseInt(numeroTexto);
		System.out.println(numeroEntero);
		
		double numeroDecimal = Double.parseDouble(numeroTexto);
		System.out.println(numeroDecimal);
		
		int numero = 123;
		String textoInt = String.valueOf(numero);
		System.out.println(textoInt);
		
		double decimal = 123.0;
		String textoDouble = String.valueOf(decimal);
		System.out.println(textoDouble);
	}
}
