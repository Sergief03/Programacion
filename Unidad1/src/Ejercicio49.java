public class Ejercicio49 {
    public static void main(String[]args){
        int numero=26520;
        int numeroPremiado=68579;
        String resultado;

        if (numeroPremiado==numero){
            resultado="Numero premiado: coincide totalmente";
        }else {
            resultado=((numeroPremiado/10000==numero/10000&&numero%10==numeroPremiado%10))? "Numero premiado: reintegro":"Numero  no premiado";
        }

        System.out.println(resultado);
    }
}
