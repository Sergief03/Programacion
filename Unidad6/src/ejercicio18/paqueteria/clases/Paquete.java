package ejercicio18.paqueteria.clases;

import java.util.Objects;

public class Paquete implements Comparable<Paquete>{
    public static final int ALTA=1;
    public static final int MEDIA=2;
    public static final int BAJA=3;

    private String producto;
    private String direccionDestino;
    private int prioridad;

    public Paquete(String pro, String dd, int pri){
        this.producto=pro;
        this.direccionDestino=dd;
        if (!(pri==Paquete.ALTA||pri==Paquete.MEDIA||pri==Paquete.BAJA)) {
            throw new IllegalArgumentException("Introduce un nivel de prioridad valido");
        }
        this.prioridad=pri;
    }

    public String getProducto(){
        return this.producto;
    }

    public String getDireccionDestino(){
        return this.direccionDestino;
    }

    public int getPrioridad(){
        return this.prioridad;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Paquete paquete)) return false;
        return Objects.equals(producto, paquete.producto) && Objects.equals(direccionDestino, paquete.direccionDestino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto, direccionDestino, prioridad);
    }

    @Override
    public int compareTo(Paquete o) {
        return this.prioridad-o.prioridad;
    }
}
