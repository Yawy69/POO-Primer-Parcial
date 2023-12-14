/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ejemplo;

/**
 *
 * @author Yannick
 */
public class animales {
    String nombre;
    int edad;
    public animales (String nombre, int edad){

        this.nombre=nombre;
        this.edad=edad; 
        
    }
   public void comer(String especie){
        System.out.println("Esta comiendo el:" + especie);

   }


}