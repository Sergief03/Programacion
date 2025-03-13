package ejercicio6.trabajadores.clases;

import java.util.HashMap;
import java.util.Map;

public class Programador extends TrabajadorTecleante{
    private Map<String, String> lenguajes;

    public Programador(String n, int s, int nDni, char lDni, int ppm) {
        super(n, s, nDni, lDni, ppm);
        this.lenguajes=new HashMap<>();
    }

    public void aprenderLenguaje(String lenguaje, String holaMundo){
        this.lenguajes.put(lenguaje,holaMundo);
    }

    public String programarHolaMundo(String lenguaje) throws IllegalStateException{
        String programa=this.lenguajes.get(lenguaje);
        if (programa==null){
            throw new IllegalStateException("El programador no conoce ese lenguaje");
        }

        return programa;
    }
}
