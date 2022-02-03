
import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author L
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal perro = new Perro(" Pipo ", "Carne", 4, "pitbull");
        perro.alimentarse();

        Perro perro1 = new Perro(" Charly ", "Sobras", 5, "puroPerro");
        perro1.alimentarse();
        
        Animal gato = new Gato("Moncho ", "Lauchas", 7, "Angora");
        gato.alimentarse();
        
       
        Animal caballo = new Caballo("Braulio ", "Alfalfa", 21, "puraSangre");
        caballo.alimentarse();
        
        System.out.println("Hello world");
        
        

    }

}
