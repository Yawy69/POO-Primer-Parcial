/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author Yannick
 */
public abstract class Empleado {
    public String nombre;
    public String apellido;
    public int edad;
    private double salario;

    public Empleado() {
        this.nombre = "John";
        this.apellido = "Doe";
        this.edad = 30;
        this.salario = 0;
    }

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (edad >= 18 && edad <= 65) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 65");
        }
        this.salario = 0;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
    }

    public abstract void mostrarInformacion();

    public abstract double calcularBono();
}
