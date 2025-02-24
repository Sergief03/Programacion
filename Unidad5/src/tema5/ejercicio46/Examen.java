package tema5.ejercicio46;

import org.hamcrest.Condition;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private List<String> alumnos;
    private List<Double> notas;

    public Examen(){
        this.alumnos=new ArrayList<>();
        this.notas=new ArrayList<>();
    }

    public void añadirNota(String alumno, double nota) throws IllegalArgumentException{
        this.alumnos.add(alumno);
        if (nota>=0&&nota<=10){
            this.notas.add(nota);
        }else {
            throw new IllegalArgumentException("Nota no valida");
        }
    }

    public double getNota(String alumno)throws IllegalArgumentException{
        if (this.alumnos.contains(alumno)){
            return this.notas.get(this.alumnos.indexOf(alumno));
        }else {
            throw new IllegalArgumentException("El alumno no existe");
        }
    }

    public double getNotaMedia() throws IllegalArgumentException{
        double media=0;
        if (this.alumnos.isEmpty()){
            throw  new IllegalArgumentException("no hay alumnos");
        }
        for (Double d:this.notas){
            media+=d;
        }
        return media/this.notas.size();
    }

    public boolean mediaAprobada(){
        return getNotaMedia()>=5? true:false;
    }

    public List<String> getAprobados(){
        List<String> aprobados=new ArrayList<>();
        for (int i=0; i<this.notas.size();i++){
            if (this.notas.get(i)>=5){
                aprobados.add(this.alumnos.get(i));
            }
        }
        return aprobados;
    }
}
