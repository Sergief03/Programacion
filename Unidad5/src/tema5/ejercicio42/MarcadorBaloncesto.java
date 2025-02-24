package tema5.ejercicio42;

public interface MarcadorBaloncesto {
    public abstract void añadirCanasta(TipoEquipo e, TipoCanasta t);
    public abstract String getNombre(TipoEquipo e);
    public  int getPuntos(TipoEquipo e);
    public default String getMarcador(){
        return getNombre(TipoEquipo.LOCAL)+" "+getPuntos(TipoEquipo.LOCAL)+" - "+getNombre(TipoEquipo.VISITANTE)+" "+getPuntos(TipoEquipo.VISITANTE);
    }
}
