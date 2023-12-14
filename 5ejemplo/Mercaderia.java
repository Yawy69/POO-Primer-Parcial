/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5ejemplo;

/**
 *
 * @author Yannick
 */
public class Mercaderia extends Registro {
     
    public Mercaderia(String Nombre, int edad, int NumeroId) {
        super(Nombre, edad, NumeroId);
    }
     
    
   
    public void aceptarcarrera(){
        System.out.println(this.Nombre +" Acepto Entrega ");
       
    }
    
        public void cancelarcarrera(){
        System.out.println(this.Nombre +" Cancelo la entrega ");
           
    }
    
}
