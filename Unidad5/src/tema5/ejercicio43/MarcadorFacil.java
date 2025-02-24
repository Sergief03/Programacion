package tema5.ejercicio43;

import tema5.ejercicio42.MarcadorBaloncesto;
import tema5.ejercicio42.TipoCanasta;
import tema5.ejercicio42.TipoEquipo;

public class MarcadorFacil implements MarcadorBaloncesto {
    private String nombreEquipoLocal;
    private String  nombreEquipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;

    public MarcadorFacil(String local, String visitante){
        this.nombreEquipoLocal=local;
        this.nombreEquipoVisitante=visitante;
        this.puntosLocal=this.puntosVisitante=0;
    }

    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        if (e.equals(TipoEquipo.LOCAL) ){
            this.puntosLocal=t.getValor();
        }else {
            this.puntosVisitante=t.getValor();
        }
    }

    @Override
    public String getNombre(TipoEquipo e) {
        String nombre="";
        if(e.equals(TipoEquipo.LOCAL)){
            nombre=this.nombreEquipoLocal;
        }else {
            nombre=this.nombreEquipoVisitante;
        }
        return nombre;
    }

    @Override
    public int getPuntos(TipoEquipo e) {
        int puntos=0;
        if(e.equals(TipoEquipo.LOCAL)){
            puntos=this.puntosLocal;
        }else {
            puntos=this.puntosVisitante;
        }
        return puntos;
    }
}
