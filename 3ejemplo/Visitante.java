/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3ejemplo;

/**
 *
 * @author Yannick
 */
public class Visitante extends Persona {
    public String numeroCarnet;

    public Visitante(String nombre, int edad) {
        super(nombre, edad);
        this.numeroCarnet = numeroCarnet;
    }

    public void comprar() {
        System.out.println("El visitante esta comprando.");
    }
}
    
