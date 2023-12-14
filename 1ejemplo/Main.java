/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1ejemplo;

/**
 *
 * @author Yannick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class main {

    public static void main(String[] args) throws Exception  { 

        System.out.println("hola mundo"); //syso//

        animales animal1=new animales("Lila", 3);
        
        System.out.println("el nombre del animal es:"+ animal1.nombre);
        System.out.println("su edad es:" +animal1.edad);

        animal1.comer("animal");       
        
        Caballo Caballo1 = new Caballo("Zeus", 4, "relincho");
        System.out.println("El nombre del caballo es:"+ Caballo1.nombre);
        System.out.println("su edad es:" + Caballo1.edad);
        System.out.println("su sonido es:" + Caballo1.sonido);

        Caballo1.comer("Caballo");

        pollo pollo1 = new pollo("Claudio", 1, "Amarillo");
        System.out.println("El nombre del pollo es:"+ pollo1.nombre);
        System.out.println("su edad es:" + pollo1.edad);
        System.out.println("su color es:" + pollo1.colores);

        pollo1.comer("pollo");

    
        
    }  

}

    
}
