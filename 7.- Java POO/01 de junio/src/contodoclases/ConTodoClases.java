package contodoclases;

import java.util.Scanner;

public class ConTodoClases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int incre;  
        int decre; 
        Contador contador1 = new Contador();
        
        System.out.println("Ingrese numero a incrementar: ");
        incre = sc.nextInt()+1; 

        
        System.out.println("El incremento es "+incre);
    
       System.out.println("");
       
        System.out.println("Ingrese numero a decrementar: ");
        decre = sc.nextInt()-1; 
        
        System.out.println("El decremento es "+decre);
    }
}