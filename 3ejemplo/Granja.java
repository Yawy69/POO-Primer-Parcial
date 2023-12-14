/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3ejemplo;

/**
 *
 * @author Yannick
 */
public class Granja {
    public String nombrePublico;
    public final int numeroRegistro;

    public Granja(String nombrePublico, int numeroRegistro) {
        this.nombrePublico = nombrePublico;
        this.numeroRegistro = numeroRegistro;
    }

    public void vacuna() {
        System.out.println("El animal en el Granja ha sido vacunado.");
    }

    public void comer() {
        System.out.println("El animal en el Granja esta comiendo.");
    }

    public void dormir() {
        System.out.println("El animal en el Granja esta durmiendo.");
    }
}