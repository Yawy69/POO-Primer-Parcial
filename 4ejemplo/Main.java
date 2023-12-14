/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4ejemplo;

import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
    do {    
    try {    
        System.out.print("Ingrese el nombre del Cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del Cliente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del Cliente: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del Cliente: ");
        String NumeroId = scanner.nextLine();
        
        cliente cliente1 = new cliente (nombre,edad,NumeroId);
        cliente1.setCedula(cedula);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el Cliente");
        
     do {    
    try {    
        System.out.print("Ingrese el nombre del chofer de moto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del chofer de moto: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cédula del chofer de moto: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del chofer de moto: ");
        String Numeroplaca = scanner.nextLine();
        System.out.print("Ingrese la numero de carnet del chofer de moto: ");
        String codigomoto = scanner.nextLine();
        
        Chofermoto chofermoto1 = new Chofermoto (nombre,edad,Numeroplaca,codigomoto);
        chofermoto1.setCedula(cedula);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el chofer de moto. ");
        
           
    
    
    }
}