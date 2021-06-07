package pkg03dejunio;

public class cuenta{
private String nombre, Cuenta;
    private double saldo;
    
    public cuenta(){
    }
 
    public cuenta(String nombre, String Cuenta, double saldo){
        this.nombre = nombre; 
        this.Cuenta = Cuenta;
        this.saldo = saldo;
    }

    public void setnombreCliente(String nombreCliente){
        this.nombre = nombreCliente;
    }
    public String getnombreCliente(){
        return this.nombre;
    }
    public void setCuenta(String Cuenta){
        this.Cuenta = Cuenta;
    }
    public String getCuenta(){
        return this.Cuenta;
    }
    public void setsaldo(double saldo){
        if(saldo > 0){
            this.saldo = saldo;
        }
    }
    public double getsaldo(){
        return this.saldo;
    }

    
    
    //Metodo deposito y metodo giro
    
    public void deposito(double deposito){
        this.saldo += deposito;
    }
    
    public boolean giro (double giro){
        boolean flag = true;
        if(giro <= this.saldo){
            this.saldo -= giro;
        }
        else {
            flag = false;
        }
        
        return flag;
    }
}