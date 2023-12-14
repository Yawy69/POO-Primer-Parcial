/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3ejemplo;

/**
 *
 * @author Yannick
 */
public class Persona {

    public String nombre;
    public int edad;
    

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public void comer() {
        System.out.println("La persona esta comiendo.");
    }

    public void dormir() {
        System.out.println("La persona esta durmiendo.");
    }
}

 
