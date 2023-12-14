/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Yannick
 */
public class DivisionEntreCeroError {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        
        try {
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero no permitida.");
        }
    }
}