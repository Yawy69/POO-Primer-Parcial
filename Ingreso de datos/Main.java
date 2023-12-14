/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingreso.de.datos;

/**
 *
 * @author Yannick
 */
public class Main {
    
    public static void main(String[] args) {
        // Ejemplo de uso
        ingresarPersona("Juan", 30, 1.75, "Masculino");
        ingresarPersona("María", 25, 1.60, "Femenino");

        System.out.println("Total de personas registradas: " + Persona.getContadorPersonas());
    }

    public static void ingresarPersona(String nombre, int edad, double estatura, String genero) {
        Persona nuevaPersona = new Persona(nombre, edad, estatura, genero);
        nuevaPersona.guardarEnArchivo();
    }
}