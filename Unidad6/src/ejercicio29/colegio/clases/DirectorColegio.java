package ejercicio29.colegio.clases;

import java.util.ArrayList;
import java.util.List;

public class DirectorColegio extends EmpleadoColegio{
    private List<Double> notasColegio;

    public DirectorColegio(String n, String c) {
        super(n, c);
        this.notasColegio=new ArrayList<>();
    }

    public double getNotaMediaColegio(){
        double media=0;
        for (Double d:this.notasColegio){
            media+=d;
        }
        return media/this.notasColegio.size();
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        this.notasColegio.add(nota.valorNumerico());
    }
}
