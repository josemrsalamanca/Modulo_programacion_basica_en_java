package pkg31mamyoclase;

public class Aula {
    private int id; 
    private Profesor profesor;
    private Alumno[] alumnos; 
    private String materia; 
    
    private final int MAX_ALUMNOS = 20; 
    
    public Aula(){
        id = 1;
        profesor = new Profesor();
        alumnos = new Alumno[MAX_ALUMNOS];
        materia = Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0, 2)];
    }
    
    private void creaAlumnos(){
        for(int i=0; i < alumnos.length;i++){
            alumnos[i] = new Alumno();     
        }
    }
    
    private boolean asistenciaAlumnos(){
        int cuentaAsistencias = 0; 
        for(int i=0; i < alumnos.length;i++){
            if(alumnos[i].isAsistencia()){
                cuentaAsistencias++; 
            }
        }
        return cuentaAsistencias >= ((int)(MAX_ALUMNOS/2));

    }
    
    
    public boolean darClase(){
        if(!profesor.isAsistencia()){
            System.out.println("EL profesor no esta, no se puede dar clase");
            return false; 
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma, no se puede dar la clase");
            return false; 
        }else if(asistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente, no se puede dar la clase");
            return false;
        }
         System.out.println("Se puede dar clases");
         return true; 
    }
    public void notas(){
        int chicosApro = 0;
        int chicasApro = 0;
        
        for(int i=0; i < alumnos.length;i++){
            if(alumnos[i].getNota()>=5){
                if(alumnos[i].getSexo()=='H'){
                    chicosApro++;
                }else{
                    chicasApro++; 
                }
                System.out.println(alumnos[i].toString());
            }
        }      
        System.out.println("Hay "+chicosApro+" chicos y "+chicasApro+" chicas aprobados/aprobadas");
    }
}
