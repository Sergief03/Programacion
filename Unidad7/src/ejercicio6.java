import bpc.daw.objetos.DepositoAgua;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;

public class ejercicio6 {
    public static void main(String[] args) {
        //a
        List<String> dias = new ArrayList<>(List.of("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"));
        dias.removeIf(dia-> (dia.length()>5));

        //b
        List<Integer> numeros=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        numeros.removeIf(num->num%2!=0);

        //c
        List<Character> caracteres=new ArrayList<>(List.of('A','b','C','d','F','f','G','h','I','j'));
        caracteres.removeIf(character -> character>='A'||character<='Z');

        //d
        List<LocalDate> fechas = new ArrayList<>(List.of(
                LocalDate.of(2024, 3, 1),
                LocalDate.of(2024, 3, 5),
                LocalDate.of(2024, 3, 10),
                LocalDate.of(2024, 3, 15),
                LocalDate.of(2024, 3, 20)
        ));

        fechas.removeIf(fecha->!(fecha.equals(LocalDate.now())));

        //e
        List<DepositoAgua> deposito=new ArrayList<>(List.of(
                new DepositoAgua(60,100),
                new DepositoAgua(20,120),
                new DepositoAgua(81,160),
                new DepositoAgua(20,100),
                new DepositoAgua(90,90)
        ));

        deposito.removeIf(depositoAgua -> (depositoAgua.getCantidadActual()*100/(double)depositoAgua.getCapacidadMaxima())>50);

        //f
        List<String> semana=new ArrayList<>(List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"));
        semana.removeIf( dia->{
            double media=0;
            for (int i=0;i<dia.length();i++){
                media+=dia.charAt(i);
            }
            return (media/dia.length())>110;
        });
    }
}
