package clases;

import java.util.*;

public class BarajaLista implements Baraja{
    private List<Carta> cartas;

    public BarajaLista(){
        this.cartas=new ArrayList<>();
    }

    public BarajaLista(TipoBaraja tb){
        this(tb,false);
    }

    public BarajaLista(TipoBaraja tb, boolean barajar){
        this.cartas=new ArrayList<>();
        for (int i=0;i<4;i++){
            for (int j=1;j<=12;j++){
                if (tb.equals(TipoBaraja.COMPLETA)) {
                    this.cartas.add(new Carta(Palo.values()[i],j));

                }else {
                    if (j!=8&&j!=9){
                        this.cartas.add(new Carta(Palo.values()[i],j));
                    }
                }
            }
        }
        if (barajar){
            barajar();
        }
    }

    @Override
    public Carta sacarCarta() {
        return this.cartas.remove(new Random().nextInt(this.cartas.size()));
    }

    @Override
    public void ponerCarta(Carta c) {
        this.cartas.add(c);
    }

    @Override
    public void barajar() {
        Collections.shuffle(this.cartas);
    }

    @Override
    public Map<Palo, Integer> contarCartas() {
        Map<Palo, Integer> baraja=new HashMap<>();
        int cartas=0;
        for (int i=0;i<4;i++){
            for (int j=0;j<this.cartas.size();j++){
                if (this.cartas.get(j).palo().equals(Palo.values()[i])){
                    cartas++;
                    baraja.put(Palo.values()[i],cartas);
                }
            }
            cartas=0;
        }
        return baraja;
    }
}
