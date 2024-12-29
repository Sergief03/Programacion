import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.Random;

public class Ejercicio48 {
    public static void main(String[] args) {
        Consola consola= new Consola();
        Teclado teclado= consola.getTeclado();
        CapaTexto capaTexto= consola.getCapaTexto();
        Random random=new Random();

        int anchoPantalla= capaTexto.getNumeroColumnas()-1;
        int altoPantalla=capaTexto.getNumeroFilas()-1;

        int coordenadaX=36;
        int coordenadaY=13;

        int xTesoro= random.nextInt(1,anchoPantalla);
        int yTesoro= random.nextInt(1,altoPantalla);

        teclado.setTipoCursor(Teclado.CURSOR_NULO);
        int nivel=1;
        int puntos=0;
        String palabra="";

        for (int i=80;i>0;i--){
            double distancia=Math.sqrt(Math.pow(coordenadaX-xTesoro,2)+Math.pow(coordenadaY-yTesoro,2));
            if (distancia>35){
                palabra="MUY FRIO";
            } else if (distancia<=35&&distancia>15) {
                palabra="FRIO";
            } else if (distancia<=15&&distancia>5) {
                palabra="CALIENTE";
            }else {
                palabra="QUEMANDO";
            }

            capaTexto.print("Nivel: "+nivel+"     Puntos: "+puntos+" Movimientos restantes: "+i+" "+palabra);
            capaTexto.print(coordenadaY,coordenadaX,"O");
            char tecla= teclado.leerCaracter();
            String direccion=Character.toString(tecla);

            if (direccion.equalsIgnoreCase("a") ) {
                coordenadaX--;
            } else if (direccion.equalsIgnoreCase("d")) {
                coordenadaX++;
            } else if (direccion.equalsIgnoreCase("w")) {
                coordenadaY--;
            } else if (direccion.equalsIgnoreCase("s")) {
                coordenadaY++;
            }

            if (coordenadaX==xTesoro&&coordenadaY==yTesoro){
                capaTexto.cls();
                capaTexto.printct(altoPantalla/2,"HAS ENCONTRADO EL TESORO");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                nivel++;
                puntos++;
                xTesoro= random.nextInt(20);
                yTesoro= random.nextInt(20);
                i+=10;
            }

            if (coordenadaX>anchoPantalla){
                coordenadaX=1;
            } else if (coordenadaX<1) {
                coordenadaX=anchoPantalla;
            } else if (coordenadaY>altoPantalla) {
                coordenadaY=0;
            } else if (coordenadaY<1) {
                coordenadaY=altoPantalla;
            }
            capaTexto.cls();
        }
    }
}