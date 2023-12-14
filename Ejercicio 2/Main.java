/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar información sobre libro de ficción
        System.out.println("Ingrese información del libro de ficción:");
        LibroFiccion libroFiccion = new LibroFiccion();

        System.out.print("Título: ");
        libroFiccion.setTitulo(input.nextLine());

        System.out.print("Autor: ");
        libroFiccion.setAutor(input.nextLine());

        int anioPublicacionFiccion = 0;
        while (anioPublicacionFiccion <= 0) {
            try {
                System.out.print("Año de Publicación: ");
                anioPublicacionFiccion = Integer.parseInt(input.nextLine());
                if (anioPublicacionFiccion <= 0) {
                    throw new IllegalArgumentException("El año de publicación debe ser un número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un año válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        libroFiccion.setAnioPublicacion(anioPublicacionFiccion);

        System.out.print("Género: ");
        libroFiccion.setGenero(input.nextLine());

        // Solicitar información sobre libro no ficticio
        System.out.println("\nIngrese información del libro no ficticio:");
        LibroNoFiccion libroNoFiccion = new LibroNoFiccion();

        System.out.print("Título: ");
        libroNoFiccion.setTitulo(input.nextLine());

        System.out.print("Autor: ");
        libroNoFiccion.setAutor(input.nextLine());

        int anioPublicacionNoFiccion = 0;
        while (anioPublicacionNoFiccion <= 0) {
            try {
                System.out.print("Año de Publicación: ");
                anioPublicacionNoFiccion = Integer.parseInt(input.nextLine());
                if (anioPublicacionNoFiccion <= 0) {
                    throw new IllegalArgumentException("El año de publicación debe ser un número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un año válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        libroNoFiccion.setAnioPublicacion(anioPublicacionNoFiccion);

        System.out.print("Tema: ");
        libroNoFiccion.setTema(input.nextLine());

        // Mostrar información de los libros y calcular edad
        int anioActual = 2023; // Se asume el año actual como 2023
        System.out.println("\nInformación del libro de ficción:");
        libroFiccion.mostrarInformacion();
        libroFiccion.mostrarInformacionEspecifica();
        System.out.println("Edad del libro: " + libroFiccion.calcularEdad(anioActual) + " años.");

        System.out.println("\nInformación del libro no ficticio:");
        libroNoFiccion.mostrarInformacion();
        libroNoFiccion.mostrarInformacionEspecifica();
        System.out.println("Edad del libro: " + libroNoFiccion.calcularEdad(anioActual) + " años.");
    }
}