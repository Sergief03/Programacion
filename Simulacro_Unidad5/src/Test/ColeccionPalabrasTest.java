package Test;

import clase.ColeccionPalabras;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ColeccionPalabrasTest {
    @Test
    public void test1(){
        ColeccionPalabras coleccionPalabras=new ColeccionPalabras("palabras.txt");
        try {
            coleccionPalabras.cargarPalabras();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(coleccionPalabras.getTotalPalabras(),2);
        assertEquals(coleccionPalabras.quedanPalbras(),true);
    }

    @Test
    public void test2(){
        ColeccionPalabras coleccionPalabras=new ColeccionPalabras("palabras.txt");
        try {
            coleccionPalabras.cargarPalabras();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String palabra1=coleccionPalabras.getPalbraAleatoria();
        String palabra2 =coleccionPalabras.getPalbraAleatoria();
        boolean palabras=false;
        if ((palabra1.equalsIgnoreCase("hola")||palabra1.equalsIgnoreCase("adios")&&((palabra2.equalsIgnoreCase("hola")||palabra2.equalsIgnoreCase("adios"))))){
            palabras=true;
        }
        assertEquals(true,palabras );
    }


}