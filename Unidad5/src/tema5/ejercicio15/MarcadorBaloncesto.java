package tema5.ejercicio15;

import java.time.LocalDate;

public class MarcadorBaloncesto {
    public String nombreLocal;
    public String nombreVisitante;
    public int puntosLocal;
    public int puntosVisitante;
    public LocalDate fecha;

    public MarcadorBaloncesto(String nL, String nV){
        this(nL, nV, LocalDate.now());
    }

    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        this(nL,0,nV,0,f);
    }

    public MarcadorBaloncesto(String nL, int pL, String nVl, int pV, LocalDate fecha){
        this.nombreLocal=nL;
        this.puntosLocal=pL;
        this.nombreVisitante=nVl;
        this.puntosVisitante=pV;
        this.fecha=fecha;
    }

    public void añadirCanasta(char equipo,int puntos){
        if (puntos>=1&&puntos<=3){
            if (equipo=='L'){
                this.puntosLocal+=puntos;
            }else if (equipo=='V'){
                this.puntosVisitante+=puntos;
            }
        }
    }

    public  void reset(){
        this.puntosVisitante=0;
        this.puntosLocal=0;
    }

    public int getPuntosLocal(){
        return this.puntosLocal;
    }

    public int getPuntosVisitante(){
        return this.puntosVisitante;
    }

    public boolean ganaLocal(){
        return getPuntosLocal()>getPuntosVisitante()? true:false;
    }

    public boolean ganaVisitante(){
        return getPuntosLocal()<getPuntosVisitante()? true:false;
    }

    public boolean hayEmpate(){
        return getPuntosLocal()==getPuntosVisitante()? true:false;
    }
}
