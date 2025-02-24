package tema5.ejercicio28;

public class Matricula {
    public static int siguienteNumeroMatricula=1;
    private int numeroMatricula;
    private String nombreALumno;
    private String nombreAsignatura;

    public Matricula(String nombreAlumno, String nombreAsignatura){
        this.nombreALumno=nombreAlumno;
        this.nombreAsignatura=nombreAsignatura;
        this.numeroMatricula=this.siguienteNumeroMatricula++;
    }

    public String getNombreALumno(){
        return this.nombreALumno;
    }

    public String getNombreAsignatura(){
        return this.nombreAsignatura;
    }

    public int getNumeroMatricula(){
        return this.numeroMatricula;
    }
}
