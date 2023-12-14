/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author Yannick
 */
public class Desarrollador extends Empleado {
    public String lenguaje;

    public Desarrollador(String nombre, String apellido, int edad, String lenguaje) {
        super(nombre, apellido, edad);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + getSalario());
        System.out.println("Lenguaje de Programacion: " + lenguaje);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.1; // Bono del 10% para desarrolladores
    }
}