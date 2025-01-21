package tema5.Ejercicio3;

import java.time.LocalDate;

public class MarcadorBaloncesto {
    public String nombreLocal;
    public String nombreVisitante;
    public int puntosLocal;
    public int puntosVisitante;
    public LocalDate fecha;

    public MarcadorBaloncesto(String nL,String nV){
        this(nL, nV, LocalDate.now());
    }

    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        this(nL,0,nV,0,f);
    }

    public MarcadorBaloncesto(String nL,int pL,String nVl,int pV, LocalDate fecha){
        this.nombreLocal=nL;
        this.puntosLocal=pL;
        this.nombreVisitante=nVl;
        this.puntosVisitante=pV;
        this.fecha=fecha;
    }
}
