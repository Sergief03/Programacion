package tema5.ejercicio30;

import tema5.ejercicio28.Matricula;

public class Altavoz {
    public static final int VOL_MAX=255;
    public static final int VOL_MIN=0;
    private int volumen;

    public Altavoz(){
        this.volumen=0;
    }

    public void ponerVolumenMaximo(){
        this.volumen=VOL_MAX;
    }

    public void setVolumen(int v) throws IllegalArgumentException{
        if (v>=VOL_MIN&&v<=VOL_MAX){
            this.volumen=v;
        }else {
            throw new IllegalArgumentException("El volumen es incorrecto");
        }
    }

    public int getVolumen(){
        return this.volumen;
    }

    public String toString(){
        String barra = "";
        int porcentaje= (int) Math.round( getVolumen() * 10 /(double) VOL_MAX);
        for (int i=0;i<10;i++){
            if (i <  porcentaje) {
                barra+="*";
            }else {
                barra+="_";
            }
        }
        return "["+this.volumen+"] "+barra;
    }

}
