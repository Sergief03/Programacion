package clases;

import bpc.imagenescartas.lib.ImagenCarta;
import org.hamcrest.Condition;

import java.util.Scanner;

public interface Juego {
    public abstract String getNombre();
    public abstract void inicializar();
    public abstract void turnoJugador();
    public abstract void turnoOrdenador();
    public abstract boolean finJuego();
    public abstract TipoJugador getganador();
    public default void jugar(){
        boolean continuar=true;
        while (continuar){
            System.out.println(getNombre());
            inicializar();
            while (!finJuego()){
                turnoJugador();
                turnoOrdenador();
            }
            String ganador="No ha ganado nadie";

            if (!getganador().equals(null)) {
                if (getganador().equals(TipoJugador.PERSONA)){
                    ganador="Ha ganado el jugador";
                } else if (getganador().equals(TipoJugador.ORDENADOR)) {

                    ganador="Ha ganado el jugador";
                }
            }



            System.out.println(ganador+"\nNueva partida(s/n)?");
            String eleccion=new Scanner(System.in).nextLine();
            if (eleccion.equalsIgnoreCase("n")){
                continuar=false;
            }else if (eleccion.equalsIgnoreCase("s")){
                ImagenCarta.cerrarTodas();
            }


        }

    }
}
