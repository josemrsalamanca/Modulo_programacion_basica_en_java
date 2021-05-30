package main2;

public class Libro {
    /* ATRUBITOS */

    public String titulo;
    public String autor;
    public int npagina; 
    public int idelibro;
      
     /* CONSTRUCTORES */
    public Libro(){      
    }
    
    public Libro(String titulo, String autor, int npagina, int idelibro){
        this.titulo = titulo;
        this.autor = autor;
        this.npagina = npagina;
        this.idelibro = idelibro;
    
}
}
