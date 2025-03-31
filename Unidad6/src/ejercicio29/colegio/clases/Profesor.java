package ejercicio29.colegio.clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profesor {
    private String nombre;
    private String asignatura;
    private List<CalificacionListener> interesados;
    private Map<Alumno,Nota> notas;

    public Profesor(String nombre, String asignatura){
        this.nombre=nombre;
        this.asignatura=asignatura;
        this.interesados=new ArrayList<>();
        this.notas=new HashMap<>();
    }

    public void addCalificacionListener(CalificacionListener interesado){
        this.interesados.add(interesado);
    }

    public String getAsignatura(){
        return this.asignatura;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void calificar(Alumno a, double n){
        Nota nota=new Nota(n);
        this.notas.put(a,nota);
        for (CalificacionListener c:this.interesados){
            c.recibirCalificacion(this,a,nota);
        }
    }
}
