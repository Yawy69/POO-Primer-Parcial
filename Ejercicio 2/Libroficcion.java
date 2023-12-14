/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Yannick
 */
class LibroFiccion extends Libro {
    String genero;

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void mostrarInformacionEspecifica() {
        System.out.println("Género: " + genero);
    }
}