/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.poo;

/**
 *
 * @author Yannick
 */

public abstract class  personas{
    public String Nombre;
    public int Edad;
    String cedula;
    
    public personas(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.Edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
    }
    

