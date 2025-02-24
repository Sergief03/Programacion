package tema5.superejercicio.ejercicio54;

import org.junit.Test;
import tema5.superejercicio.ejercicio50.Estado;
import tema5.superejercicio.ejercicio51.Titulo;
import tema5.superejercicio.ejercicio53.TituloArchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class CatalogoTitulosArchivoTest {
    @Test
    public void test1(){
        Titulo titulo=CatalogoTitulosArchivo.extraerTitulo("12345678M;Pepe López;Explotación de Sistemas Informáticos;1");
        assertEquals(titulo.getDni(),"12345678M");
        assertEquals(titulo.getNombre(),"Pepe López");
        assertEquals(titulo.getEstudios(),"Explotación de Sistemas Informáticos");
        assertEquals(titulo.getEstado().ordinal(),1);
    }

    @Test
    public void test2(){
        CatalogoTitulosArchivo catalogoTitulosArchivo=new CatalogoTitulosArchivo("Prueba.txt");
        catalogoTitulosArchivo.añadirTitulo("11111111H", "Luis López", "Carrocería", Estado.RECOGIDO);
        catalogoTitulosArchivo.añadirTitulo("22222222W", "María Pérez", "Desarrollo de aplicaciones web", Estado.SIN_RECIBIR);
        catalogoTitulosArchivo.añadirTitulo("33333333M", "John López", "Electricidad", Estado.RECIBIDO);
        assertEquals(catalogoTitulosArchivo.guardar(),true);

    }

    @Test
    public void test3(){
        CatalogoTitulosArchivo catalogoTitulosArchivo=new CatalogoTitulosArchivo("Prueba.txt");
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("Prueba.txt"));
            String[] titulo={
                    "11111111H;Luis López;Carrocería;2",
                    "22222222W;María Pérez;Desarrollo de aplicaciones web;0",
                    "33333333M;John López;Electricidad;1"
            };

            for (int i=0;i<titulo.length;i++){
                assertEquals(titulo[i],bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}