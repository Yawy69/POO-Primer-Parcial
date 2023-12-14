/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Yannick
 */
 
public abstract class Animal {
    public String nombre;
    public String apellido;
    private int edad;

    public Animal(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void establecerEdad(int edad) {
        if (edad >= 1 && edad <= 20) {
            throw new IllegalArgumentException("No admite letra o la edad no esta en el rango.");
        }
        this.edad = edad;
    }

    public int obtenerEdad() {
        return this.edad;
    }

    public void mostrarInformacion() {
        

    }
}

