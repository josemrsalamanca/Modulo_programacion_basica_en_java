package pkg07.de.junio;

public class Electrodomestiscos {
    /*ATRIBUTOS CLASE PADRE*/
    String color;
    int peso;
    int valor;
    
    
    /*CONSTRUCTOR POR DEFECTO Y CON PARAMETROS*/
    public Electrodomestiscos(){
    }
    public Electrodomestiscos(String color, int peso, int valor){
        this.color = color;
        this.peso = peso;
        this.valor = valor; 
}
    
    /*GETTER Y SETTER*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getvalor() {
        return valor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
    }
    
    /*METODOS*/
    public String toString(){
        return "{Color: " + color + " - Peso: " + peso + " - Valor: " + valor +'}';
    }
}
