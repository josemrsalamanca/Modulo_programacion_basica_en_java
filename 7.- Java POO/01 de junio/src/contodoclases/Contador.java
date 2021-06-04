package contodoclases;

public class Contador {

    private int cont; 
     
    
    public Contador(){
    cont = 1 + cont ;  
}
    
    public Contador(int cont){
        if (cont <0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }
    
    public Contador(final Contador c){
        cont = c.cont; 
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void incrementar(int cont){
        cont++;
    }
    
    public void decrementar(){
        cont--;
        if (cont<0){
            cont=0;
        }
    }
}
