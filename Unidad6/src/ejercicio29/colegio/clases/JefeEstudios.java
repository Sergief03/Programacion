package ejercicio29.colegio.clases;

import java.util.HashMap;
import java.util.Map;

public class JefeEstudios extends EmpleadoColegio{
    private Map<String, Integer> notasAsignaturas;

    public JefeEstudios(String n, String c) {
        super(n, c);
        this.notasAsignaturas=new HashMap<>();
    }

    public int getNumeroSuspensos(String asignatura){
        return this.notasAsignaturas.get(asignatura)==null? 0:this.notasAsignaturas.get(asignatura);
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        String asignatura=p.getAsignatura();
        int suspensos=this.notasAsignaturas.get(asignatura)==null? 0:this.notasAsignaturas.get(asignatura);
        if (nota.valorNumerico()<5){
            this.notasAsignaturas.put(asignatura,suspensos+1);
        }
    }
}
