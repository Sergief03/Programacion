package ejercicio18.paqueteria.clases;

import java.util.List;

public class PaquetesPepe implements EmpresaPaqueteria{
    TransportistaOrdenado pepe;

    public PaquetesPepe(){
        this.pepe=new TransportistaOrdenado(30);
    }

    @Override
    public void registrarPedido(Paquete p) {
        this.pepe.subirCamion(p);
    }

    @Override
    public List<Transportista> getTransportistas() {
        return List.of(this.pepe);
    }
}
