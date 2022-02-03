/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.  
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del  Animal. 
Crear un método en la clase Animal a través del cual cada clase hija 
deberá  mostrar luego un mensaje por pantalla informando de que se alimenta. 
Generar  una clase Main que realice lo siguiente: 
 */
package entidades;


public class Animal {
     
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
   
    public void alimentarse(){
        System.out.println("El " + getClass().getSimpleName() + " " +getNombre() + " Se alimenta de: "+ alimento );
        // Animal aux = new Animal();
         
        // System.out.println("Este perro se alimenta de: " + perro.alimento);
          //System.out.println("Este otro perro se alimenta de: " + perro1.alimento);       
           //System.out.println("Este gato se alimenta de: " + gato.alimento);      
        //System.out.println("Este caballo se alimenta de: " + caballo.alimento);
        
       // getClass().getSimpleName().toLowerCase()
    }

   // public void alimentarse() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    ///public void alimentarse() {
       
    }
    
