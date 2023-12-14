
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yannick
 */
public class Cliente extends Persona {
    private static int contadorClientes =00001;
    private final int numeroCliente;
    public String nombre;
    public int edad;
    private final String cedula;
    
    public Cliente(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.numeroCliente = ++contadorClientes;
    }
       

    public void ingresarDatosCliente(Scanner scanner) {
        boolean nombreValido = false;
        while (!nombreValido) {
            System.out.println("Ingrese el nombre del cliente (solo letras):");
            String nombreInput = scanner.nextLine();
            if (nombreInput.matches("[a-zA-Z]+")) {
                nombre = nombreInput;
                nombreValido = true;
            } else {
                System.out.println("Nombre no valido. Vuelva a intentarlo.");
            }
        }

        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.println("Ingrese la edad del cliente (solo numeros):");
                int edadInput = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                if (edadInput >= 0) {
                    edad = edadInput;
                    edadValida = true;
                } else {
                    System.out.println("La edad debe ser un numero positivo. Vuelva a intentarlo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                scanner.next();
            }
        }
       
        boolean cedulaValida = false;
        while (!cedulaValida) {
            try {
                System.out.println("Ingrese el numero de cedula del cliente (solo numeros):");
                String cedulaInput = scanner.nextLine();
                if (cedulaInput.matches("\\d+")) {
                    setCedula(cedulaInput);
                    cedulaValida = true;
                } else {
                    System.out.println("La cedula debe contener solo numeros. Vuelva a intentarlo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                scanner.next();
            }
        }
    }
    public int getNumeroCliente() {
        return numeroCliente;
    }
}