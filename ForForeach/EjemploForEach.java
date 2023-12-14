/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forforeach;

/**
 *
 * @author Yannick
 */
import java.util.ArrayList;

public class EjemploForEach {
    public static void main(String[] args) {
        // Ejemplo de foreach para recorrer un ArrayList de cadenas
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("en");
        palabras.add("Java");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}