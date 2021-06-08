package pkg07.de.junio;

public class DeJunio {

    public static void main(String[] args) {
        Electrodomestiscos electro1 = new Electrodomestiscos("/",0,0);
        
        Microonda m1 = new Microonda("Calentar comida", "Gris", 7, 40000);
        
        System.out.println("La funcion del microonda es: "+m1.getFuncion()+
                "\nColor: " + m1.getColor()  + "\nPeso: " + m1.getPeso()+
                "\nValor: " + m1.getvalor());       
        

        System.out.println("Atributos microonda: "+m1.toString());
        
        
        Tv tv1 = new Tv(125,"LG","EE.UU.","Negro",10,300000);

        System.out.println("Atributos televisor "+tv1.toString());
        
        System.out.println("Atributos electrodomestico "+electro1.toString());
        
        
        Juguera j1 = new Juguera(5,"Rojo", 2, 30000); 
        System.out.println("Nivel en que se usara la juguera "+j1.toString()); 
    }    
}
