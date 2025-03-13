package test;

import clases.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BarajaMapTest {
    @Test
    public void test1(){
        BarajaLista barajaParcial=new BarajaLista(TipoBaraja.PARCIAL);
        BarajaLista barajaCompleta=new BarajaLista(TipoBaraja.COMPLETA);
        assertEquals(barajaCompleta.getNumeroCartas(),48);
        assertEquals(barajaParcial.getNumeroCartas(),40);
    }

    @Test
    public void test2(){
        BarajaLista barajaLista=new BarajaLista(TipoBaraja.COMPLETA);
        assertNotEquals(barajaLista.sacarCarta(),barajaLista.sacarCarta());
    }

    @Test
    public void test3(){
        BarajaLista barajaLista=new BarajaLista(TipoBaraja.COMPLETA);
        Palo palo=barajaLista.sacarCarta().palo();
        int cartas=barajaLista.contarCartas().get(palo);
        assertEquals(cartas,11);
    }

    @Test
    public void test4(){
        BarajaLista barajaLista1=new BarajaLista(TipoBaraja.COMPLETA);
        BarajaLista barajaLista2=new BarajaLista(TipoBaraja.COMPLETA);
        try {
            Baraja.mezclar(barajaLista1,barajaLista2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int contar=0;
        int cartasBaraja=barajaLista2.getNumeroCartas();

        for (int i=0;i< cartasBaraja;i++){
            if (barajaLista2.sacarCarta().equals(new Carta(Palo.OROS,1))){
                contar++;
            }
        }

        assertEquals(contar,2);

    }

}