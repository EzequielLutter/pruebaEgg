
package entidades;


public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

   // public Perro(String charly, String sobras, int i, String puroPerro) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return "Perro{" + '}';
    }

   // public void alimentarse() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

   

  
    
}
