package main4;

public class Libro {
    
    /* ATRUBITOS */

    private String titulo;
    private String autor;
    private int npagina; 
    private int idelibro;
      
     /* CONSTRUCTORES */
    public Libro(){      
    }
    
    public Libro(String titulo, String autor, int npagina, int idelibro){
        this.titulo = titulo;
        this.autor = autor;
        this.npagina = npagina;
        this.idelibro = idelibro;
    } 
    
    /* GET y SET*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpagina() {
        return npagina;
    }

    public void setNpagina(int npagina) {
        this.npagina = npagina;
    }

    public int getIdelibro() {
        return idelibro;
    }

    public void setIdelibro(int idelibro) {
        this.idelibro = idelibro;
    }
    
    @Override 
    public String toString(){
        return "El libro " + titulo + " con IDE del libro " +idelibro 
                + " creado por el autor " + autor 
                +" tiene " +npagina+ " paginas";
        
    }
}    