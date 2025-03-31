package ejercicio18.paqueteria.clases;

import java.util.List;

public interface EmpresaPaqueteria {
    public abstract void  registrarPedido(Paquete p);
    public abstract List<Transportista> getTransportistas();
    public default void enviarPaquetes(){
        for (Transportista t: this.getTransportistas()){
            t.enviar();
        }
    }
}
