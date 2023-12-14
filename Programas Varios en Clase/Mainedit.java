package programacion.orientada.a.objetos;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Yannick
 */
public class Mainedit {
    public static void main(String[] args) {
        
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del zoo: ");
            String nombreZoo = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Ingrese un Dato valido. " + e.getMessage());
        } 
            
        
        try (Scanner scanner = new Scanner(System.in)) {
            boolean NumeroValido = false;
            int numero=0;
            
            do {
                try {
                    System.out.print("Ingrese el numero de registro del zoo: ");
                    numero = scanner.nextInt();
                    NumeroValido = true; // Si no hay excepción, la entrada es válida y salimos del bucle.
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar solo numeros enteros sin caracteres ni letras. Intenta de nuevo.");
                    scanner.nextLine(); // Limpiamos el buffer de entrada para evitar un bucle infinito.
                }
                
            } while (!NumeroValido); 
            
            

        /**
            
        }
      
        try {
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
        } catch (Exception e) {
            System.out.println("Error: Ingrese un Dato valido. " + e.getMessage());
        }
           
      /**
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            String nombrePersonas = scanner.next();
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor valido. " + e.getMessage());
            scanner.close();
        }
        /**
        try (Scanner scanner = new Scanner(System.in)) {
            boolean NumeroValido = false;
            int numero=0;
            
            do {
                try {
                    System.out.print("Ingrese su Edad: ");
                    numero = scanner.nextInt();
                    NumeroValido = true; // Si no hay excepción, la entrada es válida y salimos del bucle.
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar solo numeros enteros sin caracteres ni letras. Intenta de nuevo.");
                    scanner.nextLine(); // Limpiamos el buffer de entrada para evitar un bucle infinito.
                }
            } while (!NumeroValido);
            scanner.close();
        }    
        try (Scanner scanner = new Scanner(System.in)) {
            boolean NumeroValido = false;
            int numero=0;
            
            do {
                try {
                    System.out.print("Ingrese su Cedula: ");
                    numero = scanner.nextInt();
                    NumeroValido = true; // Si no hay excepción, la entrada es válida y salimos del bucle.
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar solo numeros enteros sin caracteres ni letras. Intenta de nuevo.");
                    scanner.nextLine(); // Limpiamos el buffer de entrada para evitar un bucle infinito.
                }
            } while (!NumeroValido);
            
        }*/     
            
            
       
        
        
    }
} 

    






