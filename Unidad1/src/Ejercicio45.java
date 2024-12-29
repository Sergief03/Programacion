public class Ejercicio45 {
    public static void main(String[]args){
        int año=2024;
        String resultado="";

        if ((año%400)==0){
            resultado="El año es bisiesto";
        }else if ((año%4)==0){
            resultado=((año%100)==0) ? "El año no es bisiesto":"El año es bisiesto";
        }else {
            resultado="El año no es bisiesto";
        }
        System.out.println(resultado);
    }
}
