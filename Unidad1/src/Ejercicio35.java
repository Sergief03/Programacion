public class Ejercicio35 {
    public static void main (String[]args){
        int ingresoEnero = 12000;
        int ingresoFebrero = 13000;
        int ingresoMarzo = 15000;
        int ingresoAbril = 11000;
        int ingresoMayo = 9000;
        int ingresoJunio = 12000;
        int ingresoJulio = 13000;
        int ingresoAgosto = 7000;
        int ingresoSeptiembre = 6000;
        int ingresoOctubre = 11000;
        int ingresoNoviembre = 12000;
        int ingresoDiciembre = 15000;


        int gastoEnero = 9000;
        int gastoFebrero = 8000;
        int gastoMarzo = 9000;
        int gastoAbril = 11000;
        int gastoMayo = 10000;
        int gastoJunio = 9000;
        int gastoJulio = 12000;
        int gastoAgosto = 8000;
        int gastoSeptiembre = 7000;
        int gastoOctubre = 9000;
        int gastoNoviembre = 12000;
        int gastoDiciembre = 14000;

        System.out.println("El balance de enero es " + (ingresoEnero - gastoEnero > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de febrero es " + (ingresoFebrero - gastoFebrero > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de marzo es " + (ingresoMarzo - gastoMarzo > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de abril es " + (ingresoAbril - gastoAbril > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de mayo es " + (ingresoMayo - gastoMayo > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de junio es " + (ingresoJunio - gastoJunio > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de julio es " + (ingresoJulio - gastoJulio > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de agosto es " + (ingresoAgosto - gastoAgosto > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de septiembre es " + (ingresoSeptiembre - gastoSeptiembre > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de octubre es " + (ingresoOctubre - gastoOctubre > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de noviembre es " + (ingresoNoviembre - gastoNoviembre > 0 ? "Balance positivo" : "Balance negativo"));
        System.out.println("El balance de diciembre es " + (ingresoDiciembre - gastoDiciembre > 0 ? "Balance positivo" : "Balance negativo"));


        double mediaIngresos=(ingresoEnero+ingresoFebrero+ingresoMarzo+ingresoAbril+ingresoMayo+ingresoJunio+ingresoJulio+ingresoAgosto+ingresoSeptiembre+ingresoOctubre+ingresoNoviembre+ingresoDiciembre)/12;
        double mediaGastos=(gastoEnero + gastoFebrero + gastoMarzo + gastoAbril + gastoMayo + gastoJunio + gastoJulio + gastoAgosto + gastoSeptiembre + gastoOctubre + gastoNoviembre + gastoDiciembre) / 12;

        System.out.println("\nLa media de ingresos es "+mediaIngresos);
        System.out.println("La media de gastos es " + mediaGastos );

        System.out.println("\nEl balance anual es "+((mediaIngresos-mediaGastos>0)? "Positivo":"Negativo"));



    }
}
