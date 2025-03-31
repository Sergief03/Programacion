package ejercicio25.efectosEspeciales.clases;

public class EfectoFactory {
    public static EfectoEspecial getEfecto(TipoEfecto tipo){
        EfectoEspecial efectoEspecial = null;
        switch (tipo){
            case TipoEfecto.GUIONES -> efectoEspecial=new EfectoGuiones();
            case TipoEfecto.INVERSO -> efectoEspecial=new EfectoInverso();
            case TipoEfecto.CORCHETES -> efectoEspecial=new EfectoCorchetes();
            case TipoEfecto.MAYUSCULAS -> efectoEspecial=new EfectoMayusculas();
        }
        return efectoEspecial;
    }
}
