/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

/**
 *
 * @author Yannick
 */
public class Leon extends Zoo {
    public Leon(String nombrePublico, int numeroRegistro) {
        super(nombrePublico, numeroRegistro);
    }

    public void rugir() {
        System.out.println("El león en el zoo esta rugiendo.");
    }

    public void cazar() {
        System.out.println("El león en el zoo esta cazando.");
    }
}
    
