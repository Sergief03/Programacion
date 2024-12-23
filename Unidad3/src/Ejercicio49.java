import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Ejercicio49 {
    public static void main(String[] args) {
        String cereza="cereza.jpeg";
        String siete="siete.jpeg";
        String herradura="herradura.jpeg";

        int premioCereza=100;
        int premioSiete=500;
        int premioHerradura=250;

        Random random=new Random();
        Consola consola=new Consola();
        Teclado teclado= consola.getTeclado();
        CapaSprites capaSprites= consola.getCapaSprites();
        CapaTexto capaTexto= consola.getCapaTexto();
        CapaFondo capaFondo= consola.getCapaFondo();

        int anchoPantalla=Toolkit.getDefaultToolkit().getScreenSize().width;
        int altoPantalla=Toolkit.getDefaultToolkit().getScreenSize().height;

        try {

            BufferedImage cerezaImagen=ImageIO.read(new File(cereza));
            BufferedImage sieteImagen=ImageIO.read(new File(siete));
            BufferedImage herraduraImagen=ImageIO.read(new File(herradura));
            BufferedImage bufferedImage1=cerezaImagen;
            BufferedImage bufferedImage2=cerezaImagen;
            BufferedImage bufferedImage3=cerezaImagen;

            boolean casilla1=true;
            boolean casilla2=true;
            boolean casilla3=true;
            boolean programa=true;

            while (programa){
                consola.esperarSiguienteFrame();
                capaTexto.print("Introduce el numero de casilla que quieras para.Si no pulsa cualquier otro numero para continuar o pulsa 0 para salir: ");
                int tecla=teclado.leerNumeroEntero();

                capaSprites.crearSprite(bufferedImage1, new Rectangle(0, 0, 225, 225),anchoPantalla/2-113-225 , altoPantalla/2);
                capaSprites.crearSprite(bufferedImage2, new Rectangle(0, 0, 225, 225), anchoPantalla/2-113, altoPantalla/2);
                capaSprites.crearSprite(bufferedImage3, new Rectangle(0, 0, 225, 225), anchoPantalla/2-113+225, altoPantalla/2);

                if ((tecla==1)){
                    casilla1=false;
                }

                if ((tecla==2)){
                    casilla2=false;
                }

                if ((tecla==3)){
                    casilla3=false;
                }

                if (casilla1){
                    switch (random.nextInt(1,4)){
                        case 1->bufferedImage1=cerezaImagen;
                        case 2->bufferedImage1=herraduraImagen;
                        case 3->bufferedImage1=sieteImagen;
                    }
                }

                if (casilla2){

                    switch (random.nextInt(1,4)){
                        case 1->bufferedImage2=cerezaImagen;
                        case 2->bufferedImage2=herraduraImagen;
                        case 3->bufferedImage2=sieteImagen;
                    }
                }

                if (casilla3){
                    switch (random.nextInt(1,4)){
                        case 1->bufferedImage3=cerezaImagen;
                        case 2->bufferedImage3=herraduraImagen;
                        case 3->bufferedImage3=sieteImagen;
                    }
                }

                if (casilla1==false&&casilla2==false&&casilla3==false){
                    if (bufferedImage1==cerezaImagen&&bufferedImage2==cerezaImagen&&bufferedImage3==cerezaImagen){
                        capaTexto.cls();
                        capaTexto.print("Has ganado "+premioCereza+"$");
                    }else if (bufferedImage1==sieteImagen&&bufferedImage2==sieteImagen&&bufferedImage3==sieteImagen){
                        capaTexto.cls();
                        capaTexto.print("Has ganado "+premioSiete+"$");
                    }else if (bufferedImage1==herraduraImagen&&bufferedImage2==herraduraImagen&&bufferedImage3==herraduraImagen){
                        capaTexto.cls();
                        capaTexto.print("Has ganado "+premioHerradura+"$");
                    }else {
                        capaTexto.cls();
                        capaTexto.print("No has ganado. Vuelve a intentarlo");
                    }

                }

                if (tecla==0){
                    programa=false;
                }
                capaTexto.cls();
            }
        } catch (IOException e) {
            capaTexto.cls();
            capaTexto.print(e.getMessage());
        }catch (Exception e){
            capaTexto.cls();
            capaTexto.print("Introduce un valor valido");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(e.getMessage());
            }
        }
    }
}
