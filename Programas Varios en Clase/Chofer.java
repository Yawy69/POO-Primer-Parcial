/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Chofer extends persona {
    int N_ID;
    public cuidador (int N_ID,String nombre,int edad,long cedula){
        super(nombre, edad, cedula);
        this.N_ID=N_ID;
    }
    public void cuidar_animales(){
        System.out.println(this.nombre+"empezo a cuidar animales");
    }
    
}
