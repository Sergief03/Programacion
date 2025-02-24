package tema5.test;

import org.junit.Test;
import tema5.ejercicio21.MarcadorBaloncesto;

import java.io.*;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTestEj21 {
    @Test
    public void test1(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada",12,"Estudiantes",8, LocalDate.now());
        marcadorBaloncesto.guardar("test.txt");
        try {
            assertEquals("Granada: 12 - Estudiantes: 8",new BufferedReader(new FileReader("test.txt")).readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}