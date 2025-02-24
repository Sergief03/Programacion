package tema5.ejercicio34;

import java.time.LocalTime;

public class Reloj {
    private LocalTime hora;

    public Reloj(LocalTime h){
        this.hora=h;
    }

    public Reloj(){
        this.hora=LocalTime.now();
    }

    public LocalTime getHora(){
        return this.hora;
    }

    public void añadir(int segundos){
        this.hora=this.hora.plusSeconds(segundos);
    }

    public  boolean esNoche(){
        boolean noche=false;
        if (this.hora.isAfter(LocalTime.of(20,0,0))||this.hora.isBefore(LocalTime.of(8,0,0))){
            noche=true;
        }

        return noche;
    }

    public void esperar(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.hora=LocalTime.now();
    }

    public String toString(){
        return this.hora.getHour()+":"+this.hora.getMinute()+":"+this.hora.getSecond();
    }
}
