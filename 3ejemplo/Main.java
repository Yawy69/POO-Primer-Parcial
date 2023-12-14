/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3ejemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre de la Granja: ");
            String nombreGranja = scanner.nextLine();

            System.out.print("Ingrese el numero de registro de la Granja: ");
            int registroGranja = scanner.nextInt();

            Granja granja = new Granja(nombreGranja, registroGranja);

            System.out.print("Ingrese el nombre de la Oveja: ");
            String nombreOveja = scanner.next();
            Oveja oveja = new Oveja(nombreOveja, registroGranja);
            oveja.saltar();
            oveja.correr();

            System.out.print("Ingrese el nombre del cerdito: ");
            String nombreCerdito = scanner.next();
            Cerdito cerdito = new Cerdito(nombreCerdito, registroGranja);
            cerdito.rodar();
            cerdito.jugar();

            System.out.print("Ingrese su nombre: ");
            String nombrePersonas = scanner.next();

            System.out.print("Ingrese su edad: ");
            int edadPersona = scanner.nextInt();

            scanner.nextLine();  // Limpiar el buffer de entrada

            
            Visitante visitante = new Visitante(nombrePersonas, edadPersona);
            visitante.comprar();

            Cuidador cuidador = new Cuidador(nombrePersonas, edadPersona);
            cuidador.alimentarAnimales();

        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor valido. " + e.getMessage());
        }
    }
}
    

