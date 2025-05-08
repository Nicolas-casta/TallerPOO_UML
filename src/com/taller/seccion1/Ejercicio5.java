package com.taller.seccion1;

/**
 * Ejercicio 5: Demostración de operadores relacionales y lógicos
 * Esta clase muestra ejemplos del uso de operadores de comparación
 * y operadores lógicos con valores numéricos.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaración de variables numéricas para comparación
        int num1 = 45;    // Primer número para comparar
        int num2 = 32;    // Segundo número para comparar
        
        // Operadores Relacionales
        
        // Comprueba si num2 es menor que num1 (32 < 45)
        boolean esMenor = num2 < num1;
        System.out.println(esMenor);    // Imprime: true
        
        // Comprueba si num1 es mayor que num2 (45 > 32)
        boolean esMayor = num1 > num2;
        System.out.println(esMayor);    // Imprime: true
        
        // Comprueba si los números son iguales (45 == 32)
        boolean esIgual = num1 == num2;
        System.out.println(esIgual);    // Imprime: false
        
        // Comprueba si los números son diferentes (45 != 32)
        boolean noEsIgual = num1 != num2;
        System.out.println(noEsIgual);  // Imprime: true
        
        // Operadores Lógicos
        
        /* Operador AND (&&): comprueba si ambas condiciones son verdaderas
         * num2 < num1 (true) Y num1 > num2 (true)
         * true && true = true
         */
        boolean y = num2 < num1 && num1 > num2;
        System.out.println(y);          // Imprime: true
        
        /* Operador OR (||): comprueba si al menos una condición es verdadera
         * num1 > num2 (true) O num1 == num2 (false)
         * true || false = true
         */
        boolean o = num1 > num2 || num1 == num2;
        System.out.println(o);          // Imprime: true
        
        /* Operador NOT (!): invierte el valor de la condición
         * !(num1 > num2) = !(true) = false
         */
        boolean inverso = !(num1 > num2);
        System.out.println(inverso);    // Imprime: false
    }
}