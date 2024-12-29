public class Ejercicio19 {
    public static void main(String[] args) {
        int[] ingresos={15000,16000,10000,9000,12000,13000,7000,6000,11000,13000,14000,15000};
        int[] gastos={8000,9000,11000,10000,9000,12000,10000,9000,8000,9000,9000,12000,14000};
        String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        double balance=0;
        double mediaIngresos=0;
        double mediaGastos=0;
        for (int i=0;i<12;i++){
           balance=(ingresos[i]+gastos[i])+2;
            System.out.println("El balance del mes "+meses[i]+" es "+balance);
        }
        for (int i=0;i<12;i++){
            mediaIngresos=ingresos[i]/12;
            System.out.println("La media de ingresos es "+mediaIngresos);
        }
        for (int i=0;i<12;i++){
            mediaGastos=gastos[i]/12;
            System.out.println("La media de ingresos es "+mediaGastos);
        }
        System.out.println("El balance final anual ha sido "+ ((mediaIngresos-mediaGastos)>0? "el balance ha sido positivo":"el balnce ha sido negativo"));
    }
}
