package personaabstract;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);  
        int vend; 
        
        Vendedores vendedor1 = new Vendedores();
        vendedor1.Persona();
              
        Ejecutivos ej1 = new Ejecutivos();
        ej1.Persona();
        
        Administrativos adm1 = new Administrativos();
        adm1.Persona();
        
        System.out.println("Ingrese Numero 1=Ejecutivo 2=Administrativo 3=Vendedor");
        vend = leer.nextInt(); 
        
        if(vend == 1 ){
            System.out.println("Ingresaste Ejecutivo");
        }else if(vend == 2){
            System.out.println("Ingresaste Administrativo");
        }else{
            System.out.println("Ingresaste Vendedor");
        }
        
        
    } 
}
