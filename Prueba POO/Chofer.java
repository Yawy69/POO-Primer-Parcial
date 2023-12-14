/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.poo;

/**
 *
 * @author Yannick
 */
public class Chofer extends personas{
     
    public String Numeroplaca;
    public String Codigotaxi;

    public Chofer(String Nombre, int edad,String Numeroplaca,String Codigotaxi) {
        super(Nombre, edad);
        
        this.Numeroplaca=Numeroplaca;
        this.Codigotaxi=Codigotaxi;
    }


    
    public void aceptarcarrera(){
        System.out.println(this.Nombre +" Acepto la carrera ");
       
    }
    
        public void cancelarcarrera(){
        System.out.println(this.Nombre +" Cancelo la carrera ");
       
    }
}