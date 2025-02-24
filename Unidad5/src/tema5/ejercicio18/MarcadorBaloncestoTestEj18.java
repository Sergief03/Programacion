package tema5.ejercicio18;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTestEj18 {
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test1(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada","Visitante");
        marcadorBaloncesto.añadirCanasta('G',3);
        fail("No se ha lanzado una excepcion");

    }

}