/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3ejemplo;

/**
 *
 * @author Yannick
 */
public class Cerdito extends Granja {
    public Cerdito(String nombrePublico, int numeroRegistro) {
        super(nombrePublico, numeroRegistro);
    }

    public void rodar() {
        System.out.println("El cerdito en la granja esta rodando.");
    }

    public void jugar() {
        System.out.println("El cerdito en la granja esta jugando.");
    }
}