package com.taller.seccion1;

public class Ejercicio4 {
	public static void main(String[] args) {
		int num1 = 45;
		int num2 = 32;
		
		boolean esMenor = num2<num1;
		System.out.println(esMenor);
		
		boolean esMayor = num1>num2;
		System.out.println(esMayor);
		
		boolean esIgual = num1 == num2;
		System.out.println(esIgual);
		
		boolean noEsIgual = num1 != num2;
		System.out.println(noEsIgual);
		
		boolean y = num2<num1 && num1>num2;
		System.out.println(y);
		
		boolean o = num1>num2 || num1 == num2;
		System.out.println(o);
		
		boolean inverso = !(num1>num2);
		System.out.println(inverso);
	}
}
