package tema5.test;

import org.junit.Test;
import tema5.ejercicio42.TipoCanasta;
import tema5.ejercicio42.TipoEquipo;
import tema5.ejercicio45.MarcadorDefinitivo;

import static org.junit.Assert.*;

public class MarcadorDefinitivoTest {
    @Test
    public void test1(){
        MarcadorDefinitivo marcadorDefinitivo=new MarcadorDefinitivo("Granada","Visitantes");

        for (int i = 0; i < 5; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.TIRO_LIBRE);
        }
        for (int i = 0; i < 8; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.CANASTA_NORMLA);
        }
        for (int i = 0; i < 4; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.TRIPLE);
        }

        for (int i = 0; i < 3; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.VISITANTE, TipoCanasta.TIRO_LIBRE);
        }
        for (int i = 0; i < 10; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.VISITANTE, TipoCanasta.CANASTA_NORMLA);
        }
        for (int i = 0; i < 1; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.VISITANTE, TipoCanasta.TRIPLE);
        }

        assertEquals(33, marcadorDefinitivo.getPuntos(TipoEquipo.LOCAL));
        assertEquals(26, marcadorDefinitivo.getPuntos(TipoEquipo.VISITANTE));
    }

}