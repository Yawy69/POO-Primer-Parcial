/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Zoo {
    public String nombrePublico;
    public final int numeroRegistro;

    public Zoo(String nombrePublico, int numeroRegistro) {
        this.nombrePublico = nombrePublico;
        this.numeroRegistro = numeroRegistro;
    }

    public void vacuna() {
        System.out.println("El animal en el zoo ha sido vacunado.");
    }

    public void comer() {
        System.out.println("El animal en el zoo esta comiendo.");
    }

    public void dormir() {
        System.out.println("El animal en el zoo esta durmiendo.");
    }
}



