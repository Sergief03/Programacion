package ejercicio18.paqueteria.clases;

import java.util.Collections;
import java.util.List;

public class TransportistaOrdenado extends Transportista{
    private List<Paquete> paquetes;
    private long tiempoEntrega;

    public TransportistaOrdenado(long te){
        super(te);
    }

    @Override
    public void enviar(){
        Collections.sort(this.paquetes);
        super.enviar();
    }
}
