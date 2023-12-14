/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Cuidador extends Personas {
    public String numeroId;

    public Cuidador(String nombre, int edad, String cedula, String numeroId) {
        super(nombre, edad, cedula);
        this.numeroId = numeroId;
    }

    public void alimentarAnimales() {
        System.out.println("El cuidador está alimentando a los animales.");
    }
}
   
