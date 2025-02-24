package tema5.test;

import org.junit.Before;
import org.junit.Test;
import tema5.ejercicio29.BolaDragon;

import static org.junit.Assert.*;

public class BolaDragonTest {
    @Test
    public void test1(){
        BolaDragon bolaDragon;
        for (int i=1;i<=7;i++){
            try {
                bolaDragon= BolaDragon.crearBolaDragon();
                assertEquals(i,bolaDragon.getNumero());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test(expected = Exception.class)
    public void test2(){
        BolaDragon bolaDragon;
        try {
            bolaDragon= BolaDragon.crearBolaDragon();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}