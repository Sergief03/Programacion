package clases;

import java.util.*;

public class BarajaMap implements Baraja{
    private Map<Palo,BarajaLista> cartas;

    public BarajaMap(TipoBaraja b){
        this.cartas=new HashMap<>();
        for (int i=0;i<4;i++){
            this.cartas.put(Palo.values()[i],new BarajaLista());
            for (int j=1;j<=12;j++){
                if (b.equals(TipoBaraja.COMPLETA)) {


                }else {
                    if (j!=8&&j!=9){
                        this.cartas.get(Palo.values()[i]).ponerCarta(new Carta(Palo.values()[i],j));                    }
                }
            }
        }

    }


    @Override
    public Carta sacarCarta() {
        return this.cartas.get(Palo.values()[new Random().nextInt(3)]).sacarCarta();
    }

    @Override
    public void ponerCarta(Carta c) {
        this.cartas.get(c.palo()).ponerCarta(c);
    }

    @Override
    public void barajar() {
        for (int i=0;i<4;i++){
            this.cartas.get(Palo.values()[i]).barajar();
        }
    }

    @Override
    public Map<Palo, Integer> contarCartas() {
        Map<Palo, Integer> baraja=new HashMap<>();
        for (int i=0;i<4;i++){
            baraja.put(Palo.values()[i],this.cartas.get(Palo.values()[i]).contarCartas(Palo.values()[i]));
        }
        return baraja;
    }
}
