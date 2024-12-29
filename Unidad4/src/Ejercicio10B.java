import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio10B {
    public static void main(String[] args) {
        Consola consola=new Consola();
        Random random= new Random();
        int anchoPantalla= Toolkit.getDefaultToolkit().getScreenSize().width;
        int altoPantalla=Toolkit.getDefaultToolkit().getScreenSize().height;
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        CapaTexto capaTexto= consola.getCapaTexto();
        Teclado teclado=consola.getTeclado();

        Graphics graphics=capaCanvas.getGraphics();

        String eleccion="";
        boolean repeticion=true;
        while (repeticion){
            List<Rectangle> list=new ArrayList<>();
            for (int i=0;i<20;i++) {
                list.add(new Rectangle(random.nextInt(anchoPantalla),random.nextInt(altoPantalla),20,20));
            }
            capaTexto.print("Elige una opcion:\n1. Dibujar rectangulos sin color\n" +
                    "2. Dibujar los rectangulos con color rojo\n" +
                    "3. Dibujar los rectangulos de color verde\n" +
                    "4. Salir\n");
            eleccion= teclado.leerCadenaCaracteres();
            capaTexto.cls();
            if (eleccion.matches("\\d+")&&Integer.parseInt(eleccion)<=4){
                switch (eleccion){
                    case "1"->{
                        graphics.setColor(Color.white);
                        for (Rectangle e:list){
                            graphics.drawRect((int)e.getX(),(int)e.getY(),(int)e.width,(int) e.getHeight());
                        }
                    }
                    case "2"->{
                        graphics.setColor(Color.red);
                        for (Rectangle e:list){
                            graphics.drawRect((int)e.getX(),(int)e.getY(),(int)e.width,(int) e.getHeight());
                        }
                    }
                    case "3"->{
                        graphics.setColor(Color.green);
                        for (Rectangle e:list){
                            graphics.drawRect((int)e.getX(),(int)e.getY(),(int)e.width,(int) e.getHeight());
                        }
                    }
                    case "4"->{
                        repeticion=false;
                    }
                }
                teclado.leerCaracter();
                capaCanvas.cls();
            }else {
                capaTexto.print("Introduce un valor valido");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                capaTexto.cls();
            }
        }
    }
}
