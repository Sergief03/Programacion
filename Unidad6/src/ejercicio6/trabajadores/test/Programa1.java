package ejercicio6.trabajadores.test;

import ejercicio6.trabajadores.clases.Programador;
import ejercicio6.trabajadores.clases.TecladoJava;

public class Programa1 {
    public static void main(String[] args) {
        Programador enrique = new Programador("Enrique", 1800, 22222222, 'W', 70);
        enrique.aprenderLenguaje("Java", "System.out.println(\"Hola Mundo\");");
        enrique.aprenderLenguaje("C", "#include <stdio.h>\nint main() {\n    printf(\"Hola Mundo\\n\");\n    return 0;\n}");

        enrique.setTeclado(new TecladoJava());

        System.out.println("Programador escribiendo en Java:");
        enrique.getTeclado().escribirTexto(enrique.programarHolaMundo("Java"));

        System.out.println("Programador escribiendo en C:");
        enrique.getTeclado().escribirTexto(enrique.programarHolaMundo("C"));
    }
}
