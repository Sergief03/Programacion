package tema5.ejercicio49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurante {
    private String nombre;
    private Map<String,Integer> platos;

    public Restaurante(String n, String[] pl, int[] pr){
        this.nombre=n;
        this.platos=new HashMap<>();
        for (int i=0; i<pl.length;i++){
            this.platos.put(pl[i],pr[i]);
        }
    }

    public Restaurante(String n){
        this(n,new String[]{"bocadillo", "fillete","sopa","ensalada","caviar"},new int[]{5,15,8,9,30});

    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(String nombrePlato)throws IllegalArgumentException{
        if (estaDisponible(nombrePlato)){
            return this.platos.get(nombrePlato);
        }
        throw new IllegalArgumentException("No hay ningun plato llamado "+nombrePlato);
    }

    public boolean estaDisponible(String nombrePlato){
        return this.platos.containsKey(nombrePlato)? true:false;
    }

    public List<String> getPlatosBaratos(){
        List<String> barato=new ArrayList<>();
        for (String e:this.platos.keySet()){
            if (this.platos.get(e)<12){
                barato.add(e);
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
