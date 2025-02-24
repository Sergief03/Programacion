package tema5.ejercicio45;

import tema5.ejercicio42.MarcadorBaloncesto;
import tema5.ejercicio42.TipoCanasta;
import tema5.ejercicio42.TipoEquipo;
import tema5.ejercicio44.Equipo;

public class MarcadorDefinitivo implements MarcadorBaloncesto {
    private Equipo local;
    private Equipo visitante;

    public MarcadorDefinitivo(String local, String visitante){
        this.local=new Equipo(local);
        this.visitante=new Equipo(visitante);
    }

    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        if (TipoEquipo.LOCAL.equals(e)){
            this.local=this.local.añadirCanasta(t);
        }else {
            this.visitante=this.visitante.añadirCanasta(t);
        }
    }

    @Override
    public String getNombre(TipoEquipo e) {
        String nombre="";
        if (TipoEquipo.LOCAL.equals(e)){
            nombre=this.local.nombre();
        }else {
            nombre=this.visitante.nombre();
        }
        return nombre;
    }

    @Override
    public int getPuntos(TipoEquipo e) {
        int puntos=0;
        if (TipoEquipo.LOCAL.equals(e)){
            puntos=this.local.puntos();
        }else {
            puntos=this.visitante.puntos();
        }
        return puntos;
    }
}
