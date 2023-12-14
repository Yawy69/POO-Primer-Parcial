/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4ejemplo;

/**
 *
 * @author Yannick
 */
public class Chofermoto extends Persona {
     
    public String Numeroplaca;
    public String Codigomoto;

    public Chofermoto(String Nombre, int edad,String Numeroplaca,String Codigomoto) {
        super(Nombre, edad);
        
        this.Numeroplaca=Numeroplaca;
        this.Codigomoto=Codigomoto;
    }


    
    public void aceptarcarrera(){
        System.out.println(this.Nombre +" Acepto Entrega ");
       
    }
    
        public void cancelarcarrera(){
        System.out.println(this.Nombre +" Cancelo la entrega ");
           
    }
    
}
