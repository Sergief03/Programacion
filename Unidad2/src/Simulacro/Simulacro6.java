package Simulacro;

import bpc.daw.consola.*;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class Simulacro6 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        File archivoFuente = new File("C:\\Users\\sergi\\Downloads\\sixty");
        Font fuente = null;
        try {
            fuente = Font.createFont(Font.TRUETYPE_FONT, archivoFuente).deriveFont(24f);
        } catch (FontFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        texto.setFont(fuente);
        texto.print("¡Este es el nuevo tipo de letra en Consola DAW!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
