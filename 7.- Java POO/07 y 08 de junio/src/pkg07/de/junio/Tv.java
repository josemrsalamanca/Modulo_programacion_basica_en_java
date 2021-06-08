package pkg07.de.junio;

public class Tv extends Electrodomestiscos {
   int canales;
   String marca, made; 
   
   public Tv(){
   }
   
   public Tv(int canales, String marca, String made, String color, int peso, int valor){
       super (color,peso,valor);
       this.canales = canales;
       this.marca = marca;
       this.made = made;
   }
   
   
    @Override
    public String toString(){
        return "{Canales: " + canales+ " - Marca: " + marca + " - Hecho en: " + made + '}';
    }
}
