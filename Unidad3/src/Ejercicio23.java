import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

import java.time.LocalTime;

public class Ejercicio23 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto capaTexto = consola.getCapaTexto();

        for (int i = 0; i < 30; i++) {
            LocalTime localTime = LocalTime.now();
            capaTexto.printct(10, localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
