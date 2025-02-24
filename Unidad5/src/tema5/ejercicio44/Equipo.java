package tema5.ejercicio44;

import tema5.ejercicio42.TipoCanasta;

public record Equipo(String nombre, int puntos) {
    public Equipo {
        if (puntos<0){
            throw new IllegalArgumentException("No se pueden poner puntos negativos");
        }
    }

    public Equipo(String nombre){
        this(nombre,0);
    }

    public Equipo añadirCanasta(TipoCanasta t){
        return new Equipo(this.nombre,this.puntos+ t.getValor());
    }
}
