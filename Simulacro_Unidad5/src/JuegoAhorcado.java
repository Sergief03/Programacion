import clase.ColeccionPalabras;
import clase.PalabraOculta;

import java.io.IOException;
import java.util.Scanner;

public class JuegoAhorcado {
    public static void main(String[] args) {
        ColeccionPalabras coleccionPalabras=new ColeccionPalabras("palabras.txt");

        try {
            coleccionPalabras.cargarPalabras();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int vidas=5;
        int puntos=0;
        boolean continuar=true;
        boolean acertada=true;
        String palabra=coleccionPalabras.getPalbraAleatoria();

        PalabraOculta palabraOculta=new PalabraOculta(palabra);
        char letra;
        int vecesLetras=0;
        int totalPalabras= coleccionPalabras.getTotalPalabras();
        int palabrasAcertadas=0;

        while (continuar){
            while (continuar){
                System.out.println(coleccionPalabras.getTotalPalabras());
                System.out.println("Introduce una letra: ");
                palabra=new Scanner(System.in).nextLine();
                letra=palabra.charAt(0);
                vecesLetras=palabraOculta.probarLetra(letra);
                if (vecesLetras>0){
                    puntos+=2;
                }else{
                    vidas--;
                }

                System.out.println("La letra esta "+vecesLetras+" veces\n" +
                        palabraOculta+"\n" +
                        "Puntos: "+puntos+" Vidas: "+vidas);

                if (palabraOculta.palabraAcertada()){

                    palabra= coleccionPalabras.getPalbraAleatoria();
                    palabraOculta=new PalabraOculta(palabra);
                    vidas=5;
                    totalPalabras++;
                }

                if (totalPalabras==palabrasAcertadas){
                    continuar=false;
                }

            }
        }


    }
}
