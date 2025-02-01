package tema5.test;

import org.junit.Test;
import tema5.ejemplo.Aula;

import static org.junit.Assert.*;

public class AulaTest {
    @Test
    public void test1(){
        Aula aula=new Aula("1º DAM","Pepe",5,10);
        assertEquals("1º DAM",aula.nombre);
        assertEquals("Pepe",aula.profesor);
    }

    @Test
    public void test2(){
        Aula aula=new Aula("1º DAW","Antonio",5,10);
        assertEquals(60,aula.area);
    }

    @Test
    public void test3(){
        Aula aula=new Aula(null,null,4,6);
        assertEquals("Aula sin determinar",aula.nombre);
        assertEquals("Profesor sin determinar",aula.profesor);
    }

    @Test
    public void test4(){
        Aula aula=new Aula("1º SMR", "Jose",8,4);
        assertEquals(32,aula.numeroAsientos);
    }

    @Test
    public void test5(){
        Aula aula=new Aula("2º DAW","Manolo",-3,5);
        assertEquals(5,aula.asientos.length);
        assertEquals(5,aula.asientos[0].length);
    }

    @Test
    public void test6(){
        Aula aula=new Aula(null,null);
        assertEquals(3,aula.asientos.length);
        assertEquals(2,aula.asientos[0].length);
        for (int i=0;i<aula.asientos.length;i++){
            for (int j=0;j<aula.asientos[i].length;j++){
                assertEquals("Menganito",aula.asientos[i][j]);
            }
        }
    }

    @Test
    public void test7(){
        Aula aula=new Aula(3,3,2,0);
        assertEquals("Aula sin determinar",aula.nombre);
        assertEquals("Profesor sin determinar",aula.profesor);
    }

    @Test
    public void test8(){
        Aula aula=new Aula(3,3,2,0);
        for (int i=0;i<aula.asientos.length;i++){
            for (int j=0;j<aula.asientos[i].length;j++){
                if (i==2&&j==0){
                    assertEquals("Menganito",aula.asientos[i][j]);
                }else {
                    assertEquals(null,aula.asientos[i][j]);
                }

            }
        }
    }

    @Test
    public void test9(){
        Aula aula=new Aula(3,3,6,3);
        for (int i=0;i<aula.asientos.length;i++){
            for (int j=0;j<aula.asientos[i].length;j++){
                assertEquals(null,aula.asientos[i][j]);
            }
        }
    }

}