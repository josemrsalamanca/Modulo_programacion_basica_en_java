package pkg2junio;

public class fecha {
    private int dia;
    private int mes;
    private int año;
    public String fecha; 

    
    public fecha(){
    }
    public fecha(int dia, int mes, int año){
       this.dia = dia;
       this.mes = mes;
       this.año = año; 
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getFecha() {
        fecha = this.dia + "-" + this.mes + "-" + this.año;
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }  

    public boolean fechaCorrecta(){
        boolean diaCorrecto =true, mesCorrecto = true, añoCorrecto =true;
        añoCorrecto = año > 0;
      
        if (mes >=1 && mes <=12){
            switch (mes){
            case 2:
                if (esBisiesto()){
                    diaCorrecto = dia >=1 && dia <=29;
                }else{
                    diaCorrecto = dia >=1 && dia <=28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >=1 && dia <=30;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10: 
            case 12: 
                diaCorrecto = dia >=1 && dia <=31;
                break;  
            }  
    }
            return  diaCorrecto && mesCorrecto && añoCorrecto;  
    }
           
    public String diaSiguiente(){
        dia++; 
        if(!fechaCorrecta()){
            dia=1;
            mes++;
            if(!fechaCorrecta()){
                mes=1;
                año++;
            }
        }
        
    return dia +"-"+ mes +"-"+ año;
    }
   
}

