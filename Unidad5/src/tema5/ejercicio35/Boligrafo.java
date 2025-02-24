package tema5.ejercicio35;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

import java.awt.*;

public class Boligrafo {
    private static final Color[] COLORES={Color.RED,Color.green,Color.BLUE,Color.white, Color.yellow};
    private int color;
    private CapaTexto ct;

    public Boligrafo(CapaTexto ct){
        this.ct=ct;
        setColor(0);
    }

    public void setColor(int n){
        this.color=n;
        this.ct.setColorTexto(Boligrafo.COLORES[this.color]);
    }

    public void escribir(String texto){
        this.ct.println(texto);
    }

    public void escribirGuay(String texto){
        int posicion=0;

        for (int i=0; i<texto.length();i++){
            if (posicion==Boligrafo.COLORES.length){
                posicion=0;
            }
            setColor(posicion);
            this.ct.print(texto.charAt(i));
            posicion++;
        }
    }
}
