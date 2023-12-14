/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Yannick
 */
class LibroNoFiccion extends Libro {
    String tema;

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void mostrarInformacionEspecifica() {
        System.out.println("Tema: " + tema);
    }
}