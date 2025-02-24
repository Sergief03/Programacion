package tema5.ejercicio47;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Examen {
    private Map<String, Double> notas;

    public Examen(){
        this.notas=new HashMap<>();
    }

    public void añadirNota(String alumno, double nota) throws IllegalArgumentException{
        if (nota>=0&&nota<=10){
            this.notas.put(alumno,nota);
        }else {
            throw new IllegalArgumentException("Nota no valida");
        }
    }

    public double getNota(String alumno)throws IllegalArgumentException{
        if (this.notas.containsKey(alumno)){
            return this.notas.get(alumno);
        }else {
            throw new IllegalArgumentException("El alumno no existe");
        }
    }

    public double getNotaMedia() throws IllegalArgumentException{
        double media=0;
        if (this.notas.isEmpty()){
            throw  new IllegalArgumentException("No hay alumnos");
        }
        for (String e:this.notas.keySet()){
            media+=this.notas.get(e);
        }
        return media/this.notas.size();
    }

    public boolean mediaAprobada(){
        return getNotaMedia()>=5? true:false;
    }

    public List<String> getAprobados(){
        List<String> aprobados=new ArrayList<>();
        for (String e:this.notas.keySet()){
            if (this.notas.get(e)>=5){
                aprobados.add(e);
            }
        }
        return aprobados;
    }
}
