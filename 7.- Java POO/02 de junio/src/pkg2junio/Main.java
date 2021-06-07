package pkg2junio;
import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        int año = sc.nextInt();
         
        fecha fecha1 = new fecha(dia,mes,año);
  
        
        if (fecha1.fechaCorrecta()== true){
            System.out.println("El año ingresado es: "+fecha1.getFecha());
            System.out.println("El dia siguiente a la fecha ingresada es: "+fecha1.diaSiguiente()); 
        }else{
            System.out.println("Fecha no valida");
        }
        
        
        if (fecha1.fechaCorrecta()== true){
            if (fecha1.esBisiesto()){
                System.out.println("El año ingresado es bisiesto");
            }else{
                System.out.println("");     
            }
        }        
        fecha fecha2 = new fecha(14,04,1992);
        System.out.println(fecha2.fecha);     
        }
}
