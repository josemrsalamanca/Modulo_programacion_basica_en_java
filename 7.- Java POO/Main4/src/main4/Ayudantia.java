package main4;


public class Ayudantia {
    
    /* ATRUBITOS */

    private String nombre;
    private int experiencia;
    private int edad; 
      
     /* CONSTRUCTORES */
    public Ayudantia(){      
    }
    
    public Ayudantia(String nombre, int experiencia, int edad){
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.edad = edad; 
    } 
   /* get y set */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override 
    public String toString(){
        return "El ayudante " + nombre + " con " +experiencia 
                + " años de experiencia coordinará el curso";
            
}
}
