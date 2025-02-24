package tema5.test;

import org.junit.Test;
import tema5.ejercicio30.Altavoz;
import tema5.ejercicio31.EquipoMusica;

import static org.junit.Assert.*;

public class EquipoMusicaTest {
    @Test
    public void test1(){
        EquipoMusica equipoMusica=new EquipoMusica(5);
        for (int i=0;i<5;i++){
            assertEquals(equipoMusica.getAltavoz(i).getVolumen(),0);
        }
    }

    @Test
    public void test2(){
        EquipoMusica equipoMusica=new EquipoMusica(10);

        for (int i=0;i<10;i++){
            if (i%2==0){
                equipoMusica.getAltavoz(i).setVolumen(Altavoz.VOL_MAX);
            }else {
                equipoMusica.getAltavoz(i).setVolumen(50);
            }
        }
        for (int i=0;i<10;i++){
            if (i%2==0){
                assertEquals(equipoMusica.getAltavoz(i).getVolumen(),Altavoz.VOL_MAX);

            }else {
                assertEquals(equipoMusica.getAltavoz(i).getVolumen(),50);
            }
        }
    }

}