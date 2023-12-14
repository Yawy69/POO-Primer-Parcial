/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        

        try {
            System.out.println("*****Ingrese la informacion del Desarrollador*****");

            // Nombre y Apellido
            String nombreDev, apellidoDev;
           
                System.out.print("Nombre: ");
                nombreDev = scanner.nextLine();
        

            do {
                System.out.print("Apellido: ");
                apellidoDev = scanner.nextLine();
                if (!apellidoDev.matches("[a-zA-Z]+")) {
                    System.out.println("Datos no validos. Ingrese solo letras para el apellido.");
                }
            } while (!apellidoDev.matches("[a-zA-Z]+"));

            // Edad
            int edadDev;
            do {
                System.out.print("Edad: ");
                try {
                    edadDev = Integer.parseInt(scanner.nextLine());
                    if (edadDev < 18 || edadDev > 65) {
                        System.out.println("Fuera de rango. Ingrese una edad entre 18 y 65.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Dato ingresado es erroneo. Ingrese solo numeros para la edad.");
                    edadDev = -1;
                }
            } while (edadDev < 18 || edadDev > 65);

            // Salario
            double salarioDev;

            do {
                System.out.print("Salario: ");
                try {
                    salarioDev = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error ingrese solo numeros para el salario.");
                    salarioDev = -1;
                }
            } while (salarioDev < 0);

            System.out.println("Lenguajes de Programacion Sujeridos: ");
            System.out.println("-JavaScript");
            System.out.println("-Python");
            System.out.println("-Java");
            System.out.println("-C/C++");
            System.out.println("\nIngrese el lenguaje de programacion: ");
            String lenguajeDev = scanner.nextLine();

            Desarrollador desarrollador = new Desarrollador(nombreDev, apellidoDev, edadDev, lenguajeDev);
            desarrollador.setSalario(salarioDev);
            double salarioTotalDesarrollador = desarrollador.getSalario() + desarrollador.calcularBono();
            
            System.out.println("\n*****Ingrese la informacion del Gerente*****");

            // Nombre y Apellido del Gerente
            String nombreGerente, apellidoGerente;
            
                System.out.print("Nombre: ");
                nombreGerente = scanner.nextLine();
                

            do {
                System.out.print("Apellido: ");
                apellidoGerente = scanner.nextLine();
                if (!apellidoGerente.matches("[a-zA-Z]+")) {
                    System.out.println("Datos no validos. Ingrese solo letras para el apellido.");
                }
            } while (!apellidoGerente.matches("[a-zA-Z]+"));

            // Edad del Gerente
            int edadGerente;
            do {
                System.out.print("Edad: ");
                try {
                    edadGerente = Integer.parseInt(scanner.nextLine());
                    if (edadGerente < 18 || edadGerente > 65) {
                        System.out.println("Dato ingresado es erroneo. Ingrese una edad entre 18 y 65.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error en formato numerico. Ingrese solo números para la edad.");
                    edadGerente = -1;
                }
            } while (edadGerente < 18 || edadGerente > 65);

            // Salario del Gerente
            double salarioGerente;
            
           
            do {
                System.out.print("Salario: ");
                try {
                    salarioGerente = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error ingrese solo numeros para el salario.");
                    salarioGerente = -1;
                }
            } while (salarioGerente < 0);

            // Departamento del Gerente
            
                      
            int opcionDepartamento;
            do {
                System.out.println("*******Departamentos Disponibles ******");
                System.out.println("1. Financiero");
                System.out.println("2. Recursos Humanos");
                System.out.println("3. Marketing");
                System.out.println("4. Logistica y Operaciones");
                System.out.println("5. Comercial");
                System.out.println("\nElija el numero correspondiente al departamento: ");

                try {
                    opcionDepartamento = Integer.parseInt(scanner.nextLine());
                    if (opcionDepartamento < 1 || opcionDepartamento > 5) {
                        throw new IllegalArgumentException("Opcion fuera de rango");
                    }
                } catch (NumberFormatException e) {
                    opcionDepartamento = -1;
                } catch (IllegalArgumentException e) {
                    opcionDepartamento = -1;
                }

                if (opcionDepartamento == -1) {
                    System.out.println("Opcion fuera de rango. Ingrese un numero del 1 al 5.");
                }
            } while (opcionDepartamento < 1 || opcionDepartamento > 5);

            String departamentoGerente;
            
            departamentoGerente = switch (opcionDepartamento) {
                case 1 -> "Financiero";
                case 2 -> "Recursos Humanos";
                case 3 -> "Marketing";
                case 4 -> "Logistica y Operaciones";
                case 5 -> "Comercial";
                default -> "Desconocido";
            };
            


            Gerente gerente = new Gerente(nombreGerente, apellidoGerente, edadGerente, departamentoGerente);
            gerente.setSalario(salarioGerente);
            double salarioTotalGerente = gerente.getSalario() + gerente.calcularBono();
            
            System.out.println("\n****Informacion del Desarrollador***");
            desarrollador.mostrarInformacion();
            System.out.println("Bono del Desarrollador: " + desarrollador.calcularBono());
            System.out.println("Salario Total del Desarrollador: " + salarioTotalDesarrollador);

            System.out.println("\n****Informacion del Gerente***");
            gerente.mostrarInformacion();
            System.out.println("Bono del Gerente: " + gerente.calcularBono());
            System.out.println("Salario Total del Gerente: " + salarioTotalGerente);
            
            FileWriter writer = new FileWriter("informacion.txt", true); 
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            writer.write("*****Informacion del Desarrollador*****\n");
            writer.write("Nombre: " + nombreDev +" "+ apellidoDev +"\nEdad: " + edadDev +"\nLenguaje de progrmacion: " + lenguajeDev +"\nSalario: " + salarioDev);
            writer.write("\nBono del Desarrollador: " + desarrollador.calcularBono());
            writer.write("\nSalario Total del Desarrollador: " + salarioTotalDesarrollador);
            
            writer.write("\n*****Informacion del Gerente*****\n");
            
            writer.write("Nombre: " + nombreGerente +" "+ apellidoGerente +"\nEdad: " + edadGerente +"\nDepartamento: " + departamentoGerente +"\nSalario: " + salarioGerente);
            writer.write("\nBono del Gerente: " + gerente.calcularBono());
            writer.write("\nSalario Total del Gerente: " + salarioTotalGerente);

            writer.flush();
            System.out.println("Informacion guardada exitosamente en el archivo 'informacion.txt'.");
            } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }         
          
        }
    }
