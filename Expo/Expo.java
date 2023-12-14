/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yawy;

import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class Yawy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner ls = new Scanner(System.in);

        String[] datosAlumno = new String[3];

        System.out.println("Ingrese datos para el alumno:");
        System.out.print("Nombres: ");
        datosAlumno[0] = ls.next();

        System.out.print("Apellidos: ");
        datosAlumno[1] = ls.next();

        System.out.print("Salario: ");
        datosAlumno[2] = ls.next();

        System.out.println("\nDatos del alumno:");
        System.out.println("Nombre: " + datosAlumno[0]);
        System.out.println("Apellido: " + datosAlumno[1]);
        System.out.println("Salario: " + datosAlumno[2]);
        
        ls.close();
    
}
