/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5ejemplo;

/**
 *
 * @author Yannick
 */
public abstract class Registro {
    public String Nombre;
    public int Edad;
    private String cedula;
    
    public Registro(String Nombre, int edad, int NumeroId) {
        this.Nombre = Nombre;
        this.Edad = edad;
        
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
