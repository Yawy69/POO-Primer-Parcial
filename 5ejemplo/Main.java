/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5ejemplo;

import java.util.Scanner;

/**
 *
 * @author Yannick
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean datosCorrectos = false;
        int NumeroId = 0;
    do {    
    try {    
        System.out.print("Ingrese el nombre del Comprador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del Comprador: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cedula del Comprador: ");
        String cedula = scanner.nextLine();
                
        comprador comprador1 = new comprador (nombre,edad,NumeroId);
        comprador1.setCedula(cedula);
        datosCorrectos = true;
    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un numero valido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el Cliente");
        
     do {    
    try {    
        System.out.print("Ingrese Prenda de vestir: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la talla: ");
        int edad = scanner.nextInt();
        String nextLine = scanner.nextLine();      
        System.out.print("Ingrese la cedula del motorizado para la entrega: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el numero de placa del motorizado ");
        String Numeroplaca = scanner.nextLine();
        System.out.print("Ingrese el numero de carnet del motorizado: ");
        String codigomoto = scanner.nextLine();
        
        Mercaderia mercaderia1 = new Mercaderia (nombre,edad, NumeroId);
        mercaderia1.setCedula(cedula);
        datosCorrectos = true;    

    }catch(NumberFormatException e){
        System.out.println("Error: Ingrese un número válido para la edad.");
    }
    } while (!datosCorrectos);
    datosCorrectos = false;
        System.out.println("Se registro el chofer de moto. ");
        
           
    
    
    }
}