/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingreso.de.datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Yannick
 */
class Persona {
    
    private static int contadorPersonas = 0;

    static String getContadorPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final String nombre;
    private final int edad;
    private final double estatura;
    private final String genero;

    public Persona(String nombre, int edad, double estatura, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.genero = genero;
        contadorPersonas++;
    }

    public void guardarEnArchivo() {
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("personas.txt", true))) {
                writer.write("Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + estatura + ", Género: " + genero + "\n");
            }
        } catch (IOException e) {
        }
    }

    public static int getcontadorPersonas() {
        return contadorPersonas;
    }
}
    

