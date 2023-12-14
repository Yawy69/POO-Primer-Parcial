/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Personasss {
    String nombre;//atributo
    int edad;//atributo

    // constructor
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //metodo
    public void correr(){
        System.out.println(this.nombre +" Empezo a correr");
    }
    public void nadar(){
        System.out.println(this.nombre +" Empezo a nadar");
    }
    public void dibujar(){
        System.out.println(this.nombre +"Empezo a dibujar");
    }
    public static void main(String[] args) {
        Persona p1 =new Persona("Yanncik",24);//instancia=dar vida
        p1.correr();
        p1.dibujar();
        p1.nadar();
    }
    
}
