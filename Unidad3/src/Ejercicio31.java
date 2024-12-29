import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ejercicio31 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        CapaTexto capaTexto= consola.getCapaTexto();

        capaTexto.print("Introduce una cantidad de segundos");
        Teclado teclado= consola.getTeclado();
        int segundos=teclado.leerNumeroEntero();
        Font font=Font.decode(Font.MONOSPACED);
        capaTexto.setFont(font.deriveFont(30));
        capaTexto.cls();
        for (int i=0;i<segundos;i++){
            capaTexto.printct(10, Integer.toString(segundos-i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
