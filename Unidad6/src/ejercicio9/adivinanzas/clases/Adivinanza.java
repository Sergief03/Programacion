package ejercicio9.adivinanzas.clases;

import java.time.Duration;
import java.time.Instant;

public class Adivinanza {
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;

    public Adivinanza(String e, String c){
        this.enunciado=e;
        this.respuestaCorrecta=c;
        this.inicio=null;
    }

    public String getEnunciado(){
        this.inicio=Instant.now();
        return this.enunciado;
    }

    public void comprobar(String respuesta) throws AdivinanzaException{
        if (Duration.between(Instant.now(),this.inicio).toSeconds()<30){
            if (!respuesta.equalsIgnoreCase(this.respuestaCorrecta)){
                throw new AdivinanzaIncorrectaException("Has fallado. La respuesta era: " + this.respuestaCorrecta);
            }
        }else {
            throw new TiempoSuperadoException("Tiempo superado. Has tardado más de 30 segundos.");
        }
    }
}
