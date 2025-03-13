package ejercicio3.edificios.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Hotel extends Edificio{
    private List<String> clientes;
    private int maximo;

    public Hotel(String d, int np, int m) throws IllegalArgumentException{
        super(d, np);
        if (m<0){
            throw new IllegalArgumentException("No puede haber una cantidad maxima de personas negativa");
        }
        this.clientes=new ArrayList<>();
        this.maximo=m;
    }

    public void añadirCliente(String c) throws IllegalStateException{
        if (!(this.clientes.size()<this.maximo)){
            throw new IllegalStateException("No se pueden añadir mas clientes, ya esta el maximo permitido");
        }else {
            this.clientes.add(c);
        }
    }

    public void retirarCliente(String c) throws NoSuchElementException {
        if (this.clientes.remove(c)==false){
            throw new NoSuchElementException("No existe el cliente que se intenta retirar");
        }
    }
}
