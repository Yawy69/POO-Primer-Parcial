/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2ejemplo;

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

        loro loro1 = new loro("Jelly", 3, "Eclecto");
        
        System.out.println("El nombre del loro es:"+ loro1.nombre);
        System.out.println("su edad es:" + loro1.edad);
        System.out.println("su raza es:" + loro1.raza);

        loro1.comer("loro");


        hamster hamster1 = new hamster ("rocky", 2, "Macho");
        System.out.println("El nombre del gato es:"+ hamster1.nombre);
        System.out.println("su edad es:" + hamster1.edad);
        System.out.println("su genero es:" + hamster1.genero);

        hamster1.comer("hamster");     
        
   
        
    }  

}

    
}
