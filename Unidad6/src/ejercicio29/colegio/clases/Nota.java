package ejercicio29.colegio.clases;

public record Nota(double valorNumerico) {
    public Valoracion getValoracion(){
        Valoracion valoracion=null;
        if (this.valorNumerico>=0 && this.valorNumerico <= 3) {
            valoracion=Valoracion.MUY_DEFICIENTE;
        } else if (this.valorNumerico >=3) {
            valoracion=Valoracion.INFUFICIENTE;
        } else if (this.valorNumerico>=5) {
            valoracion=Valoracion.BIEN;
        }else if (this.valorNumerico>=7){
            valoracion=Valoracion.NOTABLE;
        }else if (this.valorNumerico>=9){
            valoracion=Valoracion.SOBRESALIENTE;
        }
        return valoracion;
    }
}
