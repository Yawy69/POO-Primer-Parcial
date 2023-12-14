/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author Yannick
 */
class Libro {
    String titulo;
    String autor;
    private int anio_publicacion;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public int getAnioPublicacion() {
        return anio_publicacion;
    }

    public int calcularEdad(int anioActual) {
        return anioActual - anio_publicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anio_publicacion);
    }

    // Método abstracto para mostrar información específica de cada tipo de libro
    public void mostrarInformacionEspecifica() {
        // A implementar en clases derivadas
    }
}