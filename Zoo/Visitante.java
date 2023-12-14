/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Visitante extends Personas {
    public String numeroCarnet;

    public Visitante(String nombre, int edad, String cedula, String numeroCarnet) {
        super(nombre, edad, cedula);
        this.numeroCarnet = numeroCarnet;
    }

    public void comprar() {
        System.out.println("El visitante esta comprando.");
    }
}
    
