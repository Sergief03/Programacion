package ejercicio18.paqueteria.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpresaLowCost implements EmpresaPaqueteria{
    private Transportista[] transportistas;
    private int siguienteTransportista;

    public EmpresaLowCost(int n){
        this.transportistas=new Transportista[n];
        this.siguienteTransportista=0;
        for (int i=0;i<n;i++){
            this.transportistas[i]=new Transportista(new Random().nextInt(40,80));
        }
    }

    @Override
    public void registrarPedido(Paquete p) {
        if(this.siguienteTransportista>this.transportistas.length){
            this.siguienteTransportista=0;
        }
        this.transportistas[this.siguienteTransportista].subirCamion(p);
        this.siguienteTransportista++;
    }

    @Override
    public List<Transportista> getTransportistas() {
        List<Transportista> transportistas1=new ArrayList<>();
        for (Transportista t:this.transportistas){
            transportistas1.add(t);
        }
        return transportistas1;
    }
}
