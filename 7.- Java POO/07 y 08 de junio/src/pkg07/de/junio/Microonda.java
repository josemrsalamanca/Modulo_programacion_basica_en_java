package pkg07.de.junio;

import javax.swing.JOptionPane;

public class Microonda extends Electrodomestiscos{
    public String funcion;
    
    private Microonda(){  
    }
    public Microonda(String funcion,String color, int peso, int valor){
        super (color,peso,valor);
        this.funcion = funcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    public void mostrardatos(){
        System.out.println("Hola");
    }
    
    public String Microondas(String Microondas){
        this.funcion = "Canlentar comida";
        return funcion; 
    }    
    
    @Override
    public String toString(){
        return "{Funcion= " + funcion + '}';
    }
}
