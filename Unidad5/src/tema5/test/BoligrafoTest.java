package tema5.test;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import org.junit.Test;
import tema5.ejercicio35.Boligrafo;

import java.awt.*;


public class BoligrafoTest {
    public static void main(String[] args) {
        Consola consola=new Consola();
        Teclado teclado=consola.getTeclado();
        CapaTexto capaTexto= consola.getCapaTexto();
        Boligrafo boligrafo=new Boligrafo(capaTexto);

        capaTexto.println("Introduce un texto:");
        String texto=teclado.leerCadenaCaracteres();
        capaTexto.cls();

        capaTexto.println("Introduce el numero de posicion de un color (entre 1 y5):");
        int color=teclado.leerNumeroEntero();
        capaTexto.cls();

        boligrafo.setColor(color);
        boligrafo.escribir(texto);
        teclado.leerCaracter();

        capaTexto.cls();
        boligrafo.escribirGuay(texto);
        teclado.leerCaracter();

    }
}
