package ejercicio29.colegio.clases;

import java.util.List;

public record Alumno(String nombre, List<Nota> notas) implements CalificacionListener{
    public double getNotaMedia(){
        double media=0;
        for (Nota n:this.notas){
            media+=n.valorNumerico();
        }
        return media/this.notas.size();
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if (a.nombre.equals(this.nombre)){
            this.notas.add(nota);
        }
    }
}
