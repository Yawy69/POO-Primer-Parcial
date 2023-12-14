/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Perro {
     String raza, nombre;
    int edad;
    public Perro(String raza,String nombre, int edad){
        this.raza=raza;
        this.nombre=nombre;
        this.edad=edad;
    }
     //metodo
     public void dormir(){
        System.out.println(this.raza + this.nombre +" Empezo a dormir");

    }
    public void come(){
        System.out.println(this.raza + this.nombre +" Empezo a comer");
    }

    public static void main(String[] args) {
        Perro p1 =new Perro("Pitbull"," Bruno",2);//instancia=dar vida
        p1.come();
        p1.dormir();
    }
}
