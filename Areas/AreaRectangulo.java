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

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo: ");
        double base = input.nextDouble();

        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = input.nextDouble();

        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}