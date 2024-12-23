import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.FondoColorSolido;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio2B {
    public static void main(String[] args) {
        File archivo=new File("index.html");
        Path path=archivo.toPath();
        try {
            String codigo= Files.readString(path);

            System.out.println(codigo);
            codigo.indexOf("rgb(");
            System.out.println(codigo.indexOf("rgb("));
            int numero=codigo.indexOf("rgb(");
            int numero1=codigo.indexOf("'>");
            String rgb=codigo.substring(numero+4,numero1);
            System.out.println(rgb.length());
            int r1 = rgb.indexOf(",");
            int r2 = rgb.indexOf()
            String rgb2=rgb.substring(r1,rgb.indexOf(","));
            String r=codigo.substring(numero+4,r1);
            String g=codigo.substring(r1,rgb2);
            String b=codigo.substring(90,93);

            int rNum=Integer.parseInt(r);
            int gNum=Integer.parseInt(g);
            int bNum=Integer.parseInt(b);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
