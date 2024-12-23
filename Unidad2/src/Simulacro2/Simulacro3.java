package Simulacro2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Simulacro3 {
    public static void main(String[] args) {
        System.out.println("Introduce la hora en formato horas:minutos ");
        String hora=new Scanner(System.in).nextLine();

        try {
            LocalTime horaLocal=LocalTime.parse(hora);
            ZonedDateTime zonaLocal=ZonedDateTime.of(LocalDate.now(),horaLocal,ZoneId.of("Europe/Madrid"));
            ZonedDateTime horaAngeles= zonaLocal.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

            DateTimeFormatter formato12Horas = DateTimeFormatter.ofPattern("h:mm a").withZone(ZoneId.of("America/Los_Angeles"));
            System.out.println("La hora en California es: " + formato12Horas.format(horaAngeles).toLowerCase());
        }catch (Exception e) {
            System.out.println("Error: La hora ingresada no es válida.");
        }



    }
}
