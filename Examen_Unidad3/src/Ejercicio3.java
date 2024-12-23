import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduce una ruta de archivo: ");
        String ruta=new Scanner(System.in).nextLine();

        File file=new File(ruta);
        File tiles=new File("tiles");
        try {
            BufferedImage bufferedImage= ImageIO.read(file);
            System.out.println("Introduce un numero entero de tamaño de los tiles: ");
            boolean repetir=true;
            while (repetir){
                try {
                    int numero=new Scanner(System.in).nextInt();
                    if (numero<=0){
                        System.out.println("Introduce un valor valido");
                    }else {
                        repetir=false;
                        if (!tiles.exists()){
                            tiles.mkdirs();
                        }
                        int anchoImagen=bufferedImage.getWidth();
                        int imagenesGuardadas=0;

                        for (int m=0;m<anchoImagen;m+=numero){
                            for (int i=0;i<anchoImagen;i+=numero){
                                imagenesGuardadas++;
                                for (int j=0;j<anchoImagen/numero;j++)
                                    ImageIO.write(bufferedImage.getSubimage(i,m,numero,numero),"png",new File("tiles/"+imagenesGuardadas+".png"));

                            }
                        }
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Introduce un valor valido");
        }

    }
}
