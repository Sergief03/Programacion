package Simulacro2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Simulacro1 {
    public static void main(String[] args) {
        final String IDENTIFICADOR_VALIDO1="978";
        final int IDENTIFICADOR_VALIDO2=979;

        System.out.println("Introduce el numero del ISBN: ");
        String numero = new Scanner(System.in).nextLine();
        String identificador=numero.substring(0,3);
        System.out.println(identificador);

        if (numero.length()!=13){
            System.out.println("Error numero de caracteres incorrecto");
        }else if ((identificador.equals(IDENTIFICADOR_VALIDO1))||identificador.equals(IDENTIFICADOR_VALIDO2)) {
            System.out.println("¿Que campo del ISBN deseas consultar?\n1 - identificador" +
                    "\n2 - codigo de pais\n3 - codigo de editor\n4 - numero del articulo" +
                    "\n5 - digito de control\n6 - guardar");
            int campoNumero = new Scanner(System.in).nextInt();

            if (campoNumero == 1) {
                System.out.println(identificador);

            } else if (campoNumero == 2) {
                System.out.println(numero.substring(4, 5));

            } else if (campoNumero == 3) {
                System.out.println(numero.substring(6, 9));

            } else if (campoNumero == 4) {
                System.out.println(numero.substring(10, 12));
            } else if (campoNumero == 5) {
                System.out.println(numero.substring(13));
            } else if (campoNumero == 6) {
                try {
                    FileWriter archivo = new FileWriter("libro.xml");
                    String datosArchivo = "<?xml version=’1.0’ encoding=’UTF-8’?>\n" +
                            "<isbn identificador=’978’>\n" +
                            "<codigo_pais>848</codigo_pais>\n" +
                            "<codigo_editor>818</codigo_editor>\n" +
                            "<numero_articulo>227</numero_articulo>\n" +
                            "<digito_control>5</digito_control>\n" +
                            "</isbn>";
                    archivo.write(datosArchivo);
                    archivo.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());;
                }
            }

        }else {
                System.out.println("Error, el identificador no es valido (debe ser o 978 o 979)");

            }
        }
    }

