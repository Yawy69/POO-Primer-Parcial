/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5ejemplo;

/**
 *
 * @author Yannick
 */
public class comprador extends Registro{
    
    public String NumeroId;


    public comprador(String Nombre, int edad, int NumeroId) {
        super(Nombre, edad, NumeroId);
    }

    
    public void pedirtaxi(){
        System.out.println(this.Nombre +" Pidio a domicilio ");
       
    }
    
        public void cancelartaxi(){
        System.out.println(this.Nombre +" Ha cancelado el pedido ");
       
    }
    
}