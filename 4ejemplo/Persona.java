/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4ejemplo;

/**
 *
 * @author Yannick
 */
public abstract class Persona {
    public String Nombre;
    public int Edad;
    private String cedula;
    
    public Persona(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.Edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
