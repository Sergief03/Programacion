package test;

import clases.Foto;
import clases.ListaFotos;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ListaFotosTest {
    @Test
    public void test1(){
        ListaFotos listaFotos=new ListaFotos();
        assertTrue(listaFotos.estaVacia());

        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/alhambra.jpg");
        assertTrue(listaFotos.existeFoto("alhambra"));
    }

    @Test
    public void test2(){
        ListaFotos listaFotos=new ListaFotos();
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/alhambra.jpg");
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/hlanz.jpg");
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/foto1.jpg");
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/foto2.jpg");
        assertEquals(listaFotos.getnumeroFotos(),4);
        assertEquals(listaFotos.getFoto("alhambra").ancho(),612);
        assertEquals(listaFotos.getFoto("alhambra").alto(),408);
        listaFotos.borrarFoto("foto2");
        assertEquals(listaFotos.getnumeroFotos(),3);
    }

    @Test
    public void test3(){
        ListaFotos listaFotos=new ListaFotos();
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/alhambra.jpg");
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/hlanz.jpg");
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/foto1.jpg");
        listaFotos.añadir("C:/Users/sergi/IdeaProjects/Simulacro3/foto2.jpg");
        List<Foto> fotos=listaFotos.getFotos(new String[]{"foto1", "alhambra", "granada"});
        assertEquals(fotos.size(),2);
    }

    @Test(expected = NoSuchElementException.class)
    public void test4(){
        ListaFotos listaFotos=new ListaFotos();
        listaFotos.getFoto("granada");
        fail("No se ha lanzado ninguna excepcion");
    }

}