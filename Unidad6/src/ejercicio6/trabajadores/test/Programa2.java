package ejercicio6.trabajadores.test;

import bpc.daw.consola.Consola;
import ejercicio6.trabajadores.clases.Administrativo;
import ejercicio6.trabajadores.clases.TecladoConsolaDAW;

public class Programa2 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        TecladoConsolaDAW tecladoDAW = new TecladoConsolaDAW(consola.getCapaTexto());
        Administrativo rafa = new Administrativo("Rafa", 1500, 11111111, 'H', 100);
        rafa.setTeclado(tecladoDAW);

        rafa.escribirInforme("Soy Rafa");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
