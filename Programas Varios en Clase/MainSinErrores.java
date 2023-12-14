/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.a.objetos;

import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class MainSinErrores {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del zoo: ");
            String nombreZoo = scanner.nextLine();

            System.out.print("Ingrese el numero de registro del zoo: ");
            int registroZoo = scanner.nextInt();

            Zoo zoo = new Zoo(nombreZoo, registroZoo);

            System.out.print("Ingrese el nombre del leon: ");
            String nombreLeon = scanner.next();
            Leon leon = new Leon(nombreLeon, registroZoo);
            leon.rugir();
            leon.cazar();

            System.out.print("Ingrese el nombre del pinguino: ");
            String nombrePinguino = scanner.next();
            Pinguino pinguino = new Pinguino(nombrePinguino, registroZoo);
            pinguino.nadar();
            pinguino.pescar();

            System.out.print("Ingrese su nombre: ");
            String nombrePersonas = scanner.next();

            System.out.print("Ingrese su edad: ");
            int edadPersona = scanner.nextInt();

            scanner.nextLine();  // Limpiar el buffer de entrada

            System.out.print("Ingrese su cedula: ");
            String cedulaPersona = scanner.nextLine();
            int cedulaPersonas = 0;

            Visitante visitante = new Visitante(nombrePersonas, edadPersona, cedulaPersonas, cedulaPersonas);
            visitante.comprar();

            Cuidador cuidador = new Cuidador(nombrePersonas, edadPersona, cedulaPersonas, cedulaPersonas);
            cuidador.alimentarAnimales();

        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor valido. " + e.getMessage());
        }
    }
}
    

