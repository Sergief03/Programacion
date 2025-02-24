package tema5.ejercicio36;

import java.util.HashMap;
import java.util.Map;

public class Examen {
    private String nombre;
    private Map<String,String> respuestas;

    public Examen(String nombre){
        this.respuestas=new HashMap<>();
        this.nombre=nombre;
    }

    public Examen(Examen c){
        this(c.nombre);
        for (String e: c.respuestas.keySet()){
            responder(e,c.getRespuesta(e));
        }
    }

    public void responder(String pregunta, String respuesta){
        this.respuestas.put(pregunta,respuesta);
    }

    public String getRespuesta(String pregunta){
        return this.respuestas.get(pregunta);
    }

    public double calificar(Map<String,String> respuestasCorrectas){
        int puntos=0;
        for (String e: respuestasCorrectas.keySet()){
            if (this.respuestas.containsKey(e)){
                if (this.respuestas.get(e).equalsIgnoreCase(respuestasCorrectas.get(e))){
                    puntos++;
                }
            }
        }
        return puntos*10/(double)this.respuestas.size();
    }


    /*public double calificar(Examen respuestasCorrectas){
        int puntos=0;
        for (String e: respuestasCorrectas.respuestas.keySet()){
            if (this.respuestas.containsKey(e)){
                if (getRespuesta(e).equalsIgnoreCase(respuestasCorrectas.getRespuesta(e))){
                    puntos++;
                }
            }
        }
        return (puntos*10)/(double)this.respuestas.size();
    }*/
}
