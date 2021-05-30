package main4;

public class Main4 {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Señor de los anillos","Tolking",300,40);
        System.out.println("El titulo del libro es: "+libro1.getTitulo());
        
        Libro libro2 = new Libro("Harry Potter","Rowling",280,35);
        System.out.println("El titulo del libro es: "+libro2.getTitulo());
        
        if(libro1.getNpagina() > libro2.getNpagina()){
           System.out.println("El libro " + libro1.getTitulo()+" tiene más páginas que " + libro2.getTitulo());
        }
        
        
        Ayudantia progra = new Ayudantia("Jose",0,29);
        System.out.println("El nombre del ayudante es: "+progra.getNombre());
       
        
    } 
    
}
