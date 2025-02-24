package tema5.superejercicio.ejercicio51;

import tema5.superejercicio.ejercicio50.Estado;

public interface Titulo {
    public abstract String getDni();
    public abstract String getNombre();
    public abstract String getEstudios();
    public abstract Estado getEstado();
    public abstract void setEstado(Estado e);
}
