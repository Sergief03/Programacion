package clases;

public interface EnviadorCorreo {
    public abstract String getDireccionCorreo();
    public default void enviarMensaje(ReceptorCorreo destinatario, String textoMensaje, Formato tipo){
        destinatario.recibirMensaje(new Mensaje(getNombre(), textoMensaje,false,tipo));
    }

    public default String getNombre(){
        return getDireccionCorreo();
    }

    public default String getDominio(){
        String[] dominio= getDireccionCorreo().split("@");
        return dominio[1];
    }
}
