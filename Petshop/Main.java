
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recepcion recepcionista = new Recepcion();

        System.out.println("Ingrese el nombre de usuario de recepcionista de turno:");
        recepcionista.setUsuario(scanner.nextLine());

        recepcionista.ingresarDatosRecepcion(scanner);
        
        int numeroFactura = 0;

        Cliente cliente = new Cliente("", 0, "");
        cliente.ingresarDatosCliente(scanner);

        double sumaTotal = 0;

        do {
            int opcionElegida = mostrarMenuProductos(scanner);

            double valorProducto = 0;

            while (true) {
                if (opcionElegida != -1) {
                    valorProducto = seleccionarProducto(opcionElegida);
                    break;
                } else {
                    System.out.println("Opcion fuera de rango. Intentelo de nuevo.");
                    opcionElegida = mostrarMenuProductos(scanner);
                }
            }

            sumaTotal += valorProducto;

            System.out.println("\n Desea otro producto? (si/no)");
            String respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("no")) {
                
            System.out.println("\n-Vuelva a ingrese sus datos para la factura-");
                break;
            }
            
        guardarRegistro(cliente, sumaTotal);
        System.out.println("Datos guardados en el archivo.");
        
        } while (true);
        

        
        cliente.ingresarDatosCliente(scanner);
        System.out.println("\n*******Facturacion******");
        System.out.println("Numero de cliente: " + cliente.getNumeroCliente());
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Cedula: " + cliente.getCedula());
        System.out.println("Valor total de productos: $" + sumaTotal);
        guardarRegistro(cliente, sumaTotal);
        System.out.println("Datos guardados en el archivo.");
         
        
    }
    

    public static int mostrarMenuProductos(Scanner scanner) {
        int opcion;
        while (true) {
            System.out.println("\n--- Lista de productos ---");
            System.out.println("1. Comida");
            System.out.println("2. Accesorios");
            System.out.println("3. Ropa");
            System.out.println("4. Premios");
            System.out.println("Ingrese el numero de opcion que desea:");
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                if (opcion >= 1 && opcion <= 4) {
                    return opcion;
                } else {
                    System.out.println("Fuera de rango. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                scanner.next();
            }
        }
    }

    public static double seleccionarProducto(int opcion) {
        return switch (opcion) {
            case 1 -> 68.33;
            case 2 -> 14.25;
            case 3 -> 23.0;
            case 4 -> 8.50;
            default -> 0.0;
        };
    
    }
    

    @SuppressWarnings("empty-statement")
    public static void guardarRegistro(Cliente cliente, double sumaTotal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("registro.txt"))) {
            writer.write("Datos del cliente:\n");
            writer.write("Número de cliente: " + cliente.getNumeroCliente() + "\n");
            writer.write("Nombre: " + cliente.nombre + "\n");
            writer.write("Cedula: " + cliente.getCedula() + "\n");
            writer.write("Valor total de productos: $" + sumaTotal + "\n");
            writer.write("----------------------------------\n");
        } catch (IOException e) {
        }      
    }   
}
 