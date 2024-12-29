import bpc.daw.mario.Mario; // Ajusta el paquete según la documentación

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
         int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
         int altoPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;


        List<Mario> marios = new ArrayList<>();

        int espacio = anchoPantalla / 10;
        for (int i = 0; i < 10; i++) {
            int x = i * espacio;
            int y = altoPantalla / 2;
            marios.add(new Mario(x, y));
        }


        for (int i = 0; i < marios.size(); i++) {
            Mario mario = marios.get(i);
            if (i % 2 == 0) {
                mario.andarHacia(0, 0);
            } else {
                mario.andarHacia(1024, 0);
            }
        }
    }
}

