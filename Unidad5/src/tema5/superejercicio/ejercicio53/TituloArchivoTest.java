package tema5.superejercicio.ejercicio53;

import org.junit.Test;
import tema5.superejercicio.ejercicio50.Estado;
import tema5.superejercicio.ejercicio51.Titulo;

import static org.junit.Assert.*;

public class TituloArchivoTest {
    @Test
    public void test1(){
        Titulo titulo=new TituloArchivo("12345678M","Pepe Lopez","Explotacion de Sistemas Informaticos", Estado.RECIBIDO);
        assertEquals(titulo.getDni(),"12345678M");
        assertEquals(titulo.getNombre(),"Pepe Lopez");
        assertEquals(titulo.getEstudios(),"Explotacion de Sistemas Informaticos");
        assertEquals(titulo.getEstado(),Estado.RECIBIDO);
        assertEquals(titulo.toString(),"12345678M;Pepe Lopez;Explotacion de Sistemas Informaticos;1");

    }

}