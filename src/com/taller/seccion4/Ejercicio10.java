package com.taller.seccion4;

/**
 * Clase que representa una persona con sus datos básicos.
 * Almacena y gestiona información sobre el nombre y la edad de una persona.
 */
public class Ejercicio10 {
    /** Nombre de la persona */
    private String nombre;
    
    /** Edad de la persona en años */
    private int edad;
    
    /**
     * Constructor que crea una persona con nombre y edad específicos.
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona en años
     */
    public Ejercicio10(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Obtiene el nombre de la persona.
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona.
     * @param nombre el nuevo nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la edad de la persona.
     * @return la edad de la persona en años
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Establece la edad de la persona.
     * @param edad la nueva edad a establecer
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}