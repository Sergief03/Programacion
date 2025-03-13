package clases;

import bpc.imagenescartas.lib.ImagenCarta;
import bpc.imagenescartas.lib.ImagenCartaBuilder;
import bpc.imagenescartas.lib.OutputMode;

import java.awt.*;

public record Carta(Palo palo, int numero) {
    public Carta{
        if (numero<1||numero>12){
            throw new IllegalArgumentException("El numero debe ser del 1 al 12");
        }
    }

    public TipoCarta getTipoCarta(){
        TipoCarta tipoCarta=TipoCarta.NUMERO;
        switch (this.numero){
            case 10->tipoCarta=TipoCarta.SOTA;
            case 11->tipoCarta=TipoCarta.CABALLO;
            case 12->tipoCarta=TipoCarta.REY;
        }
        return tipoCarta;
    }

    public void mostrar(OutputMode formato, Color c){
        char palo = 0;
        switch (this.palo){
            case Palo.COPAS -> palo='C';
            case Palo.BASTOS -> palo='B';
            case Palo.ESPADAS -> palo='E';
            case Palo.OROS -> palo='O';
        }

        ImagenCarta imagenCarta=new ImagenCartaBuilder(this.numero,palo)
                .setColor(c)
                .setSalida(formato)
                .build();
        imagenCarta.mostrar();
    }
}
