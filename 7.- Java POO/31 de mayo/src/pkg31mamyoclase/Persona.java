package pkg31mamyoclase;

public abstract class Persona {
    private String nombre;
    private char sexo; 
    private int edad;
    private boolean asistencia; 
    
    private final String[] NOMBRES_CHICOS={"Pepe","Fernando","Alberto","Nacho","Miguel"}; 
    private final String[] NOMBRES_CHICAS={"Caro","Jasmina","Carla","Natalia","Viviana"}; 
    private final int CHICO = 0;
    private final int CHICA = 1;
    
    public Persona(){
        
        int determinar_sexo = MetodosSueltos.generaNumeroAleatorio(0, 1);
        if (determinar_sexo ==0){
            nombre = NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0,5)];
            sexo = 'H';
        }else{
            nombre = NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0,5)]; 
            sexo = 'M';
        }
        
        MetodosSueltos.generaNumeroAleatorio(12, 15);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    
    
    public abstract void disponibilidad(); 
    
}
