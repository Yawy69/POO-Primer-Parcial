/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author Yannick
 */
public class Gerente extends Empleado {

    /**
     *
     */
    public String departamento;

    public Gerente(String nombre, String apellido, int edad, String departamento) {
        super(nombre, apellido, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + getSalario());
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.15; // Bono del 15% para gerentes
    }
}