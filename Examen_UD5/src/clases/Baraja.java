package clases;

import java.io.IOException;
import java.util.Map;

public interface Baraja {
    public abstract Carta sacarCarta();
    public abstract void ponerCarta(Carta c);
    public abstract void barajar();
    public abstract Map<Palo,Integer> contarCartas();
    public default int contarCartas(Palo p){
        return contarCartas().get(p);
    }

    public default int getNumeroCartas(){
        int numeroCartas=0;
        Map<Palo,Integer> cartas=contarCartas();
        for (Palo p:cartas.keySet()){
            numeroCartas+= cartas.get(p);
        }
        return numeroCartas;
    }

    public default boolean estaVacia(){
        return getNumeroCartas()==0;
    }

    public static void mezclar(Baraja origen, Baraja destino) throws IOException{
        int cartasorigen=origen.getNumeroCartas();
        for (int i=0;i< cartasorigen;i++){
            destino.ponerCarta(origen.sacarCarta());
        }
    }
}
