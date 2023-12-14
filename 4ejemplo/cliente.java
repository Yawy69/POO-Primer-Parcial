/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4ejemplo;

/**
 *
 * @author Yannick
 */
public class cliente extends Persona{
    
    public String NumeroId;

    public cliente(String Nombre, int edad, String NumeroId) {
        super(Nombre, edad);
        this.NumeroId=NumeroId;
    }

    
    public void pedirtaxi(){
        System.out.println(this.Nombre +" Pidio a domicilio ");
       
    }
    
        public void cancelartaxi(){
        System.out.println(this.Nombre +" Ha cancelado el pedido ");
       
    }
    
}
