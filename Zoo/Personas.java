/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Personas {

    public String nombre;
    public int edad;
    public final String cedula;

    public Personas(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public void comer() {
        System.out.println("La persona esta comiendo.");
    }

    public void dormir() {
        System.out.println("La persona esta durmiendo.");
    }
}

 

