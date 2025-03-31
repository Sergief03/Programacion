package ejercicio18.paqueteria.clases;

import java.util.ArrayList;
import java.util.List;

public class Transportista {
    private List<Paquete> paquetes;
    private long tiempoEntrega;

    public Transportista(long te){
        this.paquetes=new ArrayList<>();
        if (te<0){
            throw new IllegalArgumentException("introduce un tiempo de espera valido");
        }
        this.tiempoEntrega=te;
    }

    public void subirCamion(Paquete p){
        this.paquetes.add(p);
    }

    public void enviar(){
        for (Paquete p: this.paquetes){
            try {
                Thread.sleep(this.tiempoEntrega);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("El paquete "+p.getProducto()+" con prioridad "+p.getPrioridad()+" ha lelgado a: "+p.getDireccionDestino());
        }
    }
}
