package personaabstract;

public class Vendedores extends PersonaAbstract{
    
    String funcion; 
    @Override 
    public void Persona(){
        System.out.println("El cargo es Vendedor");
    }
    
    public Vendedores(){
    }
    
    public Vendedores(String funcion){
        this.funcion = funcion; 
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
}
    