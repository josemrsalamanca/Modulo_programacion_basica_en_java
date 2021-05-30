package main2;

public class Main2 {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Señor de los anillos","Tolking",300,40);
        System.out.println("El titulo del libro es: "+libro1.titulo);
        
        Libro libro2 = new Libro("Harry Potter","Rowling",280,35);
        System.out.println("El titulo del libro es: "+libro2.titulo);
        
        if(libro1.npagina > libro2.npagina){
           System.out.println("El libro " + libro1.titulo +" tiene más páginas que " + libro2.titulo);
        }
        
        
        Ayudantia progra = new Ayudantia("Jose",0,29);
        System.out.println("El nombre del ayudante es: "+progra.nombre);
       
        
    } 
}
    
