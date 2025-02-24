package tema5.ejercicio48;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private String[] platos;
    private int[] precios;

    public Restaurante(String n, String[] pl, int[] pr){
        this.nombre=n;
        this.platos=pl;
        this.precios=pr;
    }

    public Restaurante(String n){
        this(n,new String[]{"bocadillo", "fillete","sopa","ensalada","caviar"},new int[]{5,15,8,9,30});

    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(String nombrePlato)throws IllegalArgumentException{
        for(int i=0;i<this.platos.length;i++){
            if (this.platos[i].equalsIgnoreCase(nombrePlato)){
                return this.precios[i];
            }
        }
            throw new IllegalArgumentException("No hay ningun plato llamado"+nombrePlato);
    }

    public boolean estaDisponible(String nombrePlato){
        boolean disponible=false;
        for(int i=0;i<this.platos.length&&!disponible;i++){
            if (this.platos[i].equalsIgnoreCase(nombrePlato)){
                disponible=true;
            }
        }
        return disponible;
    }

    public List<String> getPlatosBaratos(){
        List<String> barato=new ArrayList<>();
        for (int i=0;i<this.platos.length;i++){
            if (getPrecio(this.platos[i])<12 ){
                barato.add(this.platos[i]);
            }
        }
        return barato;
    }

    public int getCuenta(String[] platosConsumidos){
        int cuenta=0;
        for (String e:platosConsumidos){
            cuenta+=getPrecio(e);
        }
        return cuenta;
    }
}
