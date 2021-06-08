package pkg07.de.junio;

public class Juguera extends Electrodomestiscos{
    int nivel; 
    
    public Juguera(){
    }
    public Juguera(int nivel, String color, int peso, int valor){
        super (color, peso, valor);
        this.nivel = nivel; 
       
    }
    @Override
    public String toString(){
        return "{Nivel: " + nivel+'}';
    }
}
