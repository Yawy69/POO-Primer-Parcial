/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Prueba {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
    do {    
    try {    
        System.out.print("Ingrese el nombre del pasajero: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del pasajero: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del pasajero: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del psajero: ");
        String NumeroId = scanner.nextLine();
        
        pasajero pasajero1 = new pasajero (nombre,edad,NumeroId);
        pasajero1.setCedula(cedula);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el pasajero");
        
     do {    
    try {    
        System.out.print("Ingrese el nombre del chofer: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del chofer: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del chofer: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del chofer: ");
        String Numeroplaca = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del chofer: ");
        String codigotaxi = scanner.nextLine();
        
        Chofer chofer1 = new Chofer (nombre,edad,Numeroplaca,codigotaxi);
        chofer1.setCedula(cedula);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el chofer ");
        
           
    
    
    }
}
