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

    /**
     *
     * @param nombre
     * @param edad
     * @param cedulaPersonas
     * @param cedula
     */
    public Cuidador(String nombre, int edad, String cedulaPersonas, String cedula) {
        super(nombre, edad, cedula);
        this.numeroId = numeroId;
    }

    public void alimentarAnimales() {
        System.out.println("El cuidador esta alimentando a los animales.");
    }
}
   
