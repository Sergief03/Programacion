package clases;

import bpc.imagenescartas.lib.ImagenCarta;
import bpc.imagenescartas.lib.ImagenCartaBuilder;
import bpc.imagenescartas.lib.OutputMode;

import java.awt.*;

public class ElUnoMaldito implements Juego{
    private Baraja cartas;
    private TipoJugador ganador;

    public ElUnoMaldito(){

    }

    @Override
    public String getNombre() {
        return "El uno maldito";
    }

    @Override
    public void inicializar() {
        this.cartas=new BarajaLista(TipoBaraja.COMPLETA,true);
        this.ganador=null;
    }

    @Override
    public void turnoJugador() {
        Carta carta=this.cartas.sacarCarta();
        char palo = 0;
        switch (carta.palo()){
            case Palo.COPAS -> palo='C';
            case Palo.BASTOS -> palo='B';
            case Palo.ESPADAS -> palo='E';
            case Palo.OROS -> palo='O';
        }
        ImagenCarta imagenCarta=new ImagenCartaBuilder(carta.numero(),palo)
                .setColor(Color.RED)
                .setSalida(OutputMode.ASCII_ART_STRING)
                .build();

        imagenCarta.mostrar();
        if (carta.equals(new Carta(Palo.OROS,1))){
            this.ganador=TipoJugador.ORDENADOR;
        }
    }

    @Override
    public void turnoOrdenador() {
        Carta carta=this.cartas.sacarCarta();
        char palo = 0;
        switch (carta.palo()){
            case Palo.COPAS -> palo='C';
            case Palo.BASTOS -> palo='B';
            case Palo.ESPADAS -> palo='E';
            case Palo.OROS -> palo='O';
        }
        ImagenCarta imagenCarta=new ImagenCartaBuilder(carta.numero(),palo)
                .setColor(Color.RED)
                .setSalida(OutputMode.ASCII_ART_STRING)
                .build();

        imagenCarta.mostrar();
        if (carta.equals(new Carta(Palo.OROS,1))){
            this.ganador=TipoJugador.PERSONA;
        }
    }

    @Override
    public boolean finJuego() {
        return getganador()!=null;
    }

    @Override
    public TipoJugador getganador() {
        return this.ganador;
    }
}
