package pkg26mayo;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Harry Potter";
        libro1.autor = "J.K Rowling";
        libro1.npagina = 290;
        libro1.idelibro = 53325;
        System.out.println("El libro es: "+libro1.titulo+ " y su autor es: " + libro1.autor);   
        System.out.println("Tiene "+libro1.npagina+ " páginas y su Código es " + libro1.idelibro);   
    }
    
}
