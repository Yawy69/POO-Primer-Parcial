/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Yannick
 */
class Perro extends Animal {
    String raza;

    public Perro(String nombre, String apellido, int edad, String raza) {
        super(nombre, apellido, edad);
        this.raza = raza;
    }

    public String hacerSonido() {
        return "Guau";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Raza: " + this.raza);
    }
}