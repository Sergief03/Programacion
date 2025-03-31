import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.mario.Mario;
import bpc.daw.objetos.DepositoAgua;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ejercicio7 {
    public static void main(String[] args) {
        //a
        List<Mario> mario=new ArrayList<>(List.of(
                new Mario(20,40),
                new Mario(50,50),
                new Mario(100,120),
                new Mario(200,200),
                new Mario(300,300)
        ));

        mario.forEach(m->m.saltar());
        
        //b
        List<DepositoAgua> deposito=new ArrayList<>(List.of(
                new DepositoAgua(0,100),
                new DepositoAgua(0,120),
                new DepositoAgua(0,160),
                new DepositoAgua(0,100),
                new DepositoAgua(0,90)
        ));
        deposito.forEach(dep->dep.añadirLitro());

        //c
        try {
            PrintWriter printWriter=new PrintWriter("dia.txt");
            List<String> semana=new ArrayList<>(List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"));
            semana.forEach(dia->printWriter.println(dia));
            printWriter.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        //d
        Consola consola=new Consola();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics2D graphics2D= capaCanvas.getGraphics2D();
        List<Rectangle> rectangulos = new ArrayList<>(List.of(
                new Rectangle(10, 20, 30, 40),
                new Rectangle(50, 60, 70, 80),
                new Rectangle(90, 100, 110, 120),
                new Rectangle(130, 140, 150, 160),
                new Rectangle(170, 180, 190, 200)
        ));
        rectangulos.forEach(rect->{
            graphics2D.draw(rect);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        //e
        List<String> semana=new ArrayList<>(List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"));
        semana.forEach(dia->new File(dia).mkdir());

    }
}
