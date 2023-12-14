/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class Main {
    public static int ingresarEdad() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese la edad: ");
                int edad = Integer.parseInt(scanner.nextLine());
                if (edad >= 1 && edad <= 20) {
                    throw new IllegalArgumentException();
                }
                return edad;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese una edad en el rango.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del perro: ");
        String nombrePerro = scanner.nextLine();
        int edadPerro = ingresarEdad();
        System.out.print("Ingrese la raza del perro: ");
        String razaPerro = scanner.nextLine();

        System.out.print("Ingrese el nombre del gato: ");
        String nombreGato = scanner.nextLine();
        int edadGato = ingresarEdad();
        System.out.print("Ingrese el tipo de pelaje del gato: ");
        String pelajeGato = scanner.nextLine();

        // Asegúrate de que la clase Perro y Gato tengan constructores adecuados
        Perro perro = new Perro(nombrePerro, "colorOtraCaracteristica", edadPerro, razaPerro);
        Gato gato = new Gato(nombreGato, "colorOtraCaracteristica", edadGato, pelajeGato);

        System.out.println("\nNombre del perro:");
        perro.mostrarInformacion(); // Asegúrate de tener este método en la clase Perro

        System.out.println("\nNombre del gato:");
        gato.mostrarInformacion(); // Asegúrate de tener este método en la clase Gato
    }
}