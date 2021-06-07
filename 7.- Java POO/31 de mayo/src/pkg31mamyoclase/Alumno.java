
package pkg31mamyoclase;

public class Alumno extends Persona{
    private int nota; 
    public Alumno(){
        super();
        nota = MetodosSueltos.generaNumeroAleatorio(0, 10);
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(12, 15));
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public void disponibilidad() {
       
    
        int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);
        if(prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        } 
    }
}
