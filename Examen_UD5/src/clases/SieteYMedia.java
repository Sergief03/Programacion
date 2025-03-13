package clases;

import bpc.imagenescartas.lib.ImagenCarta;
import bpc.imagenescartas.lib.ImagenCartaBuilder;
import bpc.imagenescartas.lib.OutputMode;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SieteYMedia implements Juego{
    private  Baraja cartas;
    private List<Carta> jugador;
    private List<Carta> ordenador;
    private boolean jugadorFin;
    private boolean ordenadorFin;

    public SieteYMedia(){

    }

    private double getPuntuacion(Carta c){
        double puntos=0.5;
        if (!c.getTipoCarta().esFigura()){
            puntos=c.numero();
        }
        return puntos;
    }

    private double getPuntuacion(TipoJugador t){
        double puntos=0;
        if (t.equals(TipoJugador.ORDENADOR)) {
            for (Carta e: this.ordenador){
                puntos+=getPuntuacion(e);
            }
        }else{
            for (Carta e: this.jugador){
                puntos+=getPuntuacion(e);
            }
        }
        return puntos;
    }

    @Override
    public String getNombre() {
        return "Siete y media";
    }

    @Override
    public void inicializar() {
        this.cartas=new BarajaLista(TipoBaraja.PARCIAL,true);
        this.jugador=new ArrayList<>();
        this.ordenador=new ArrayList<>();
        this.jugadorFin=false;
        this.ordenadorFin= false;
    }

    @Override
    public void turnoJugador() {
        if (!this.jugadorFin&&getPuntuacion(TipoJugador.PERSONA)<=7.5){
            System.out.println("Puntos persona: "+getPuntuacion(TipoJugador.PERSONA)+
                    "\nQuieres una carta(s/n)?");
            String eleccion=new Scanner(System.in).nextLine();
            if (eleccion.equalsIgnoreCase("s")){
                Carta carta=this.cartas.sacarCarta();
                char palo = 0;
                switch (carta.palo()){
                    case Palo.COPAS -> palo='C';
                    case Palo.BASTOS -> palo='B';
                    case Palo.ESPADAS -> palo='E';
                    case Palo.OROS -> palo='O';
                }
                ImagenCarta imagenCarta=new ImagenCartaBuilder(carta.numero(),palo)
                        .setSalida(OutputMode.COLOR_BUFFERED_IMAGE)
                        .setColor(Color.GREEN)
                        .build();
                imagenCarta.mostrar();

                this.jugador.add(carta);

            }
        }else {
            this.jugadorFin=true;

        }
    }

    @Override
    public void turnoOrdenador() {
        if (!this.ordenadorFin&&getPuntuacion(TipoJugador.ORDENADOR)<=7.5){
            System.out.println("Puntos ordenador: "+getPuntuacion(TipoJugador.ORDENADOR));
            boolean eleccion=new Random().nextBoolean();
            if (eleccion){
                Carta carta=this.cartas.sacarCarta();
                char palo = 0;
                switch (carta.palo()){
                    case Palo.COPAS -> palo='C';
                    case Palo.BASTOS -> palo='B';
                    case Palo.ESPADAS -> palo='E';
                    case Palo.OROS -> palo='O';
                }
                ImagenCarta imagenCarta=new ImagenCartaBuilder(carta.numero(),palo)
                        .setSalida(OutputMode.COLOR_BUFFERED_IMAGE)
                        .setColor(Color.GREEN)
                        .build();
                imagenCarta.mostrar();
                this.ordenador.add(carta);

            }
        }else {
            this.ordenadorFin=true;

        }
    }

    @Override
    public boolean finJuego() {
        return this.jugadorFin&&this.ordenadorFin;
    }

    @Override
    public TipoJugador getganador() {
        TipoJugador ganador=null;
        double ordenador=getPuntuacion(TipoJugador.ORDENADOR);
        double persona=getPuntuacion(TipoJugador.PERSONA);
        if (!(ordenador<=7.5&&persona<=7.5)){
            if (ordenador>persona){
                ganador=TipoJugador.ORDENADOR;
            }else {
                ganador=TipoJugador.PERSONA;
            }
        }
        return ganador;
    }
}
