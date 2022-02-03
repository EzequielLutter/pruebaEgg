/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author L
 */
public class Gato  extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    //public Gato(String moncho, String lauchas, int i, String angora) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getAlimento() {
        return alimento;
    }

    @Override
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public Integer getEdad() {
        return edad;
    }

    @Override
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String getRaza() {
        return raza;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + '}';
    }

  
    
    
    
}
