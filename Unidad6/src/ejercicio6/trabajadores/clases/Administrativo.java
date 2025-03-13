package ejercicio6.trabajadores.clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Administrativo extends TrabajadorTecleante{
    public Administrativo(String n, int s, int nDni, char lDni, int ppm) {
        super(n, s, nDni, lDni, ppm);
    }

    public void escribirInforme(String t){
        this.teclado.escribirTexto("Fecha: "+ LocalDate.now()+" "+LocalTime.now()+"\n"+t);
    }
}
