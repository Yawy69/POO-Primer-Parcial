/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Pasajero {
    
    String nombre;
    int edad;
    private final long cedula;

    public PasajeroString nombre,int edad,long cedula){
        this.nombre=nombre;
        this.edad=edad;
        this.cedula=cedula;
    }
    public long getcedula(){
        return cedula;
    }
    public void dormir(){
        System.out.println(this.nombre +" Empezo a saltar");
    }
    public void comer(){
        System.out.println(this.nombre +" Empezo a comer");
    }
    
}
