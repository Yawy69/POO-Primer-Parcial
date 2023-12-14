/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3ejemplo;

/**
 *
 * @author Yannick
 */
public class Cuidador extends Persona {
    public String numeroId;

    /**
     *
     * @param nombre
     * @param edad
     * @param cedulaPersonas
         */
    public Cuidador(String nombre, int edad) {
        super(nombre, edad);
        this.numeroId = numeroId;
    }

    public void alimentarAnimales() {
        System.out.println("El cuidador esta alimentando a los animales.");
    }
}
   
