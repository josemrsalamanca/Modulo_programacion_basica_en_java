package personaabstract;

public abstract class PersonaAbstract {
    
    public abstract void Persona();
    
    double peso, estatura;
    int edad; 
    String nombre;
    
    public PersonaAbstract(){
    }
    
    public PersonaAbstract(double peso, double estatura, int edad, String nombre){
        this.peso = peso;
        this.estatura = estatura; 
        this.edad = edad; 
        this.nombre =nombre; 
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
