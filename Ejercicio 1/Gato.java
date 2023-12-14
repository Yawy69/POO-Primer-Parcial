/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Yannick
 */
class Gato extends Animal {
    
    String pelaje;

    public Gato(String nombre, String apellido, int edad, String pelaje) {
        super(nombre, apellido, edad);
        this.pelaje = pelaje;
    }

    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Pelaje: " + this.pelaje);
    }
}