package ejercicio22.animales.clases;

public class TransporteAnimales extends Jaula{
    public TransporteAnimales() {
        super(6, 580);
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a){
        boolean contiene=false;
        if (this.animales.size()==0){
            contiene=true;
        }else {
            if (a instanceof Leon leon){
                contiene=this.animales.contains(leon);
            }else if (a instanceof Tigre tigre){
                contiene=this.animales.contains(tigre);
            }

        }
        return super.comprobarDisponibilidadPlaza(a)&&contiene;
    }
}
