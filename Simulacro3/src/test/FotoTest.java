package test;

import clases.Foto;
import clases.Tamaño;
import org.junit.Test;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;
public class FotoTest {
    @Test
    public void test1(){
        try {
            Foto foto=Foto.cargarFoto("C:/Users/sergi/IdeaProjects/Simulacro3/foto1.jpg");
            assertEquals(foto.nombre(),"foto1");
            assertEquals(foto.ancho(),800);
            assertEquals(foto.alto(),600);
            assertEquals(foto.tamaño(), Tamaño.PEQUEÑO);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test2(){
        try {
            Foto foto=Foto.cargarFoto("C:/Users/sergi/IdeaProjects/Simulacro3/foto2.jpg");
            assertTrue(foto.mayorQue(Foto.cargarFoto("C:/Users/sergi/IdeaProjects/Simulacro3/foto1.jpg")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void test3(){
        try {
            Foto foto=Foto.cargarFoto("foto2.jpg");
            ImageIO.write((RenderedImage) foto.toBlancoNegro().imagen(),"png", new File("blanconegro.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
  
}