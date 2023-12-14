/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areas;

/**
 *
 * @author Yannick
 */
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();

        double area = PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}