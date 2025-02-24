package tema5.test;

import org.junit.Test;
import tema5.ejercicio42.TipoCanasta;
import tema5.ejercicio44.Equipo;

import static org.junit.Assert.*;

public class EquipoTest {
    @Test
    public void test1(){
        TipoCanasta[] tipoCanastas=TipoCanasta.values();

        for (TipoCanasta e: tipoCanastas){
            Equipo equipo=new Equipo("Hlanz Basket");
            assertEquals(equipo.añadirCanasta(e).puntos(),e.getValor());
        }
    }

}