/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3ejemplo;

/**
 *
 * @author Yannick
 */
public class Oveja extends Granja {
    public Oveja(String nombrePublico, int numeroRegistro) {
        super(nombrePublico, numeroRegistro);
    }

    public void saltar() {
        System.out.println("la Oveja en la granja esta saltando.");
    }

    public void correr() {
        System.out.println("la Oveja en la granja esta corriendo.");
    }
}
    
