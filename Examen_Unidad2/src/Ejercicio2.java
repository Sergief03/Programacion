import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Fondo;
import bpc.daw.consola.FondoColorSolido;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio2 {
    public static void main(String[] args) {
        File archivo=new File("index.html");
        Path path=archivo.toPath();
        try {
            String codigo= Files.readString(path);

            String r=codigo.substring(83,85);
            String g=codigo.substring(86,89);
            String b=codigo.substring(90,93);

            int rNum=Integer.parseInt(r);
            int gNum=Integer.parseInt(g);
            int bNum=Integer.parseInt(b);

            Consola consola=new Consola();
            CapaFondo capaFondo=consola.getCapaFondo();
            FondoColorSolido fondoColorSolido=new FondoColorSolido(rNum,gNum,bNum);
            capaFondo.setFondo(fondoColorSolido);
            Thread.sleep(2000);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
