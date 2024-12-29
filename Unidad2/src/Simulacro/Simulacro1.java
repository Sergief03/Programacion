package Simulacro;

import bpc.daw.consola.CapaBorrable;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

import java.awt.*;

import static java.lang.Thread.sleep;

public class Simulacro1 {
    public static void main(String[] args) {
        Point point=new Point(300,300);
        Color color=new Color(255,0,0);
        Consola consola=new Consola("Hola",500,500);
        CapaTexto capaTexto= consola.getCapaTexto();
        capaTexto.situarCursor(30,15);
        capaTexto.setTamTexto(11);
        capaTexto.setColorTexto(color);
        capaTexto.printct(15,"Bienvenidos al Isntituto");

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
