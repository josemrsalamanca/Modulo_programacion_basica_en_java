package pkg03dejunio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        String nombre, cta;
        double saldo, deposito;
        
        int flag = 2, aux = 0, op = 0, op2 = 0;

        
        ArrayList<cuenta> cuenta = new ArrayList<cuenta>();
        

        System.out.println("Ingrese los siguientes datos");
        do{
            System.out.println("Nombre Cliente:");
            nombre = leer.nextLine();
            System.out.println("Numero de cuenta");
            cta = leer.nextLine();
            System.out.println("Saldo");
            saldo = leer.nextDouble();

            cuenta.add(new cuenta(nombre, cta, saldo));
            System.out.println("Desea ingresar otro cliente (1=SI, 2=NO)");
            flag = leer.nextInt();
            leer.nextLine(); 
        }while(flag == 1); 

        do{
            System.out.println("1.- Realizar deposito");
            System.out.println("2.- Realizar giro");
            System.out.println("3.- Consultar saldo");
            System.out.println("4.- Realizar transferencia");
            System.out.println("5.- Actualizar Datos");
            System.out.println("6.- Salir");

            System.out.println("Escoja una opcion");
            flag = leer.nextInt();
            if(flag != 6){ 
                System.out.println("Escoja la cuenta a manipular: ");
                for(int i = 0; i < cuenta.size(); i++){
                    System.out.println(i + ".- " + cuenta.get(i).getnombreCliente());
                }
                do {
                    op = leer.nextInt();
                    if(op > cuenta.size()){
                        System.out.println("Cliente no existe, favor elegir cliente de la lista");
                    }
                }while (op > cuenta.size());
                
                leer.nextLine(); 
            }

            switch(flag){
                case 1: // DEPOSITO
                    System.out.println("Ingrese monto de deposito");
                    deposito = leer.nextDouble();
                    cuenta.get(op).deposito(deposito);
                    System.out.println("deposito realizado!");
                    break;
                case 2: // GIRO
                    System.out.println("Saldo cuenta: $" + cuenta.get(op).getsaldo());
                    System.out.println("Ingrese monto del giro");
                    double giro = leer.nextDouble();
                    boolean act = cuenta.get(op).giro(giro);
                    if(act){ 
                        System.out.println("giro realizado!");
                    }
                    else {
                        System.out.println("Saldo Insuficiente, Saldo en cuenta es de $" + cuenta.get(op).getsaldo());
                    }
                    break;
                case 3: //SALDO
                    System.out.println("Saldo en cuenta es $" + cuenta.get(op).getsaldo());
                    break;
                    
                case 4: //TRANSFERENCIA
                    System.out.println("Escoja la cuenta a transferir: ");
                    for(int i = 0; i < cuenta.size(); i++){
                        System.out.println(i + ".- " + cuenta.get(i).getnombreCliente());
                    }
                    do {
                        op2 = leer.nextInt();
                        if(op2 > cuenta.size()){
                            System.out.println("Cliente no existe, favor elegir cliente de la lista");
                        }
                        if(op2 == op){
                            System.out.println("No se puede transferir a si mismo, favor de elegir otro cliente de la lista");
                        }
                    }while (op2 > cuenta.size() && op2 != op);
                    
                    System.out.println("Ingrese monto a transferir");
                    double trans = leer.nextDouble();
                    act = cuenta.get(op).giro(trans); 
                    if(act){
                        cuenta.get(op2).deposito(trans);
                        System.out.println("TRANFERENCIA DE $" + trans + " Realizada con exito a cuenta de " + cuenta.get(op2).getnombreCliente());
                    }
                    else {
                        System.out.println("SALDO INSUFICIENTE EN CUENTA ORIGEN!");
                    }
                    break;
                    
                case 5: //SALIR
                    System.out.println("Hasta pronto");
                    break;
                    
                default:
                    System.out.println("Ingrese opción valida");
                    break;
            }
            
        }while(flag != 5);
    }  
}