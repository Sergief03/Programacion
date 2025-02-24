package tema5.ejercicio40;


import java.awt.font.TextHitInfo;

public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima){
    public DepositoAguaInmutable {
        if (capacidadActual<0 || capacidadMaxima<0){
            throw new IllegalArgumentException("Las cantidaddes deben ser positivas");
        }
        if (capacidadActual > capacidadMaxima) {
            throw new IllegalArgumentException("La capacidad actual no puede ser mayor que la capacidad máxima");
        }
    }

    public DepositoAguaInmutable(int capacidadMaxima) {
        this(0,capacidadMaxima);
        if (capacidadMaxima<0){
            throw new IllegalArgumentException("La cacpacidad maxima no puede ser negativa");
        }
    }

    public DepositoAguaInmutable añadirLitro(){
        return new DepositoAguaInmutable(this.capacidadActual+1,this.capacidadMaxima);
    }

    public DepositoAguaInmutable retirarLitro(){
        return new DepositoAguaInmutable(this.capacidadActual-1,this.capacidadMaxima);
    }

    public int getPorcentaje(){
        return this.capacidadActual*100/capacidadMaxima;
    }
}

