import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero de vertices:");
        int vertices=new Scanner(System.in).nextInt();
        int[] coordenadasx= new int[vertices];
        int[] coordenadasy=new int[vertices];

        for (int i=0; i<vertices;i++){
                System.out.println("Introduce la coordenada x "+i);
                coordenadasx[i]=new Scanner(System.in).nextInt();
                System.out.println("Introduce la coordenada y "+i);
                coordenadasy[i]=new Scanner(System.in).nextInt();


        }

        Consola consola=new Consola();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics2D graphics2D=capaCanvas.getGraphics2D();
        Polygon polygon=new Polygon(coordenadasx,coordenadasy,vertices);
        graphics2D.drawPolygon(polygon);
        Teclado teclado= consola.getTeclado();
        teclado.leerCaracter();

    }
}
