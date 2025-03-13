package ejercicio6.trabajadores.clases;

import bpc.daw.consola.CapaTexto;

public class TecladoConsolaDAW implements Teclado{
    private CapaTexto ct;

    public TecladoConsolaDAW(CapaTexto ct){
        this.ct=ct;
    }

    @Override
    public void escribirTexto(String mensaje) {
        this.ct.print(mensaje);
    }
}
