/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.poo;

/**
 *
 * @author Yannick
 */
public class pasajero extends personas{
     
    public String NumeroId;

    public pasajero(String Nombre, int edad,String NumeroId) {
        super(Nombre, edad);
        this.NumeroId=NumeroId;
    }

    
    public void pedirtaxi(){
        System.out.println(this.Nombre +" Pidio un taxi ");
       
    }
    
        public void cancelartaxi(){
        System.out.println(this.Nombre +" Pidio un taxi ");
       
    }
}