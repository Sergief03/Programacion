package tema5.com.ieshlanz.titulos.clases;

import tema5.com.ieshlanz.titulos.clases.Estado;

public interface Titulo {
    public abstract String getDni();
    public abstract String getNombre();
    public abstract String getEstudios();
    public abstract Estado getEstado();
    public abstract void setEstado(Estado e);
}
