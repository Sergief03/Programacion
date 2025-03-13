package clases;

public interface ReceptorCorreo {
    public abstract String getNombre();
    public abstract void recibirMensaje(Mensaje m);
}
