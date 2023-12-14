/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Vehiculo {
    String modelo;
    int fecha;


    public Vehiculo(String modelo, int fecha ){
        this.modelo=modelo;
        this.fecha=fecha;
    }
    public void movimiento( int velocidad){

        if (velocidad>50) {
            System.out.println(this.modelo+this.fecha+" El vehiculo es multado");
        } 
        else{
            System.out.println(this.modelo+this.fecha+ " El vehiculo no es multado");
        }
    }
    public static void main(String[] args) {
        Vehiculo c1 =new Vehiculo("Toyota ",2019);//instancia=dar vida
        c1.movimiento(50);


    }
    
}
