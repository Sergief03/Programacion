import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero entero positivo: ");
        try {
            int n=new Scanner(System.in).nextInt();
            if (n<=0){
                System.out.println("Introduce un numero valido");
            }else {
                int m=0;
                boolean repetir=true;
                int repeticiones=0;
                String condicion="";
                while (repetir){
                    repeticiones++;
                    if (n%2==0){
                        m=n/2;
                    }else {
                        m=n*3+1;
                    }
                    if (!(m==1)){
                        n=m;
                    }else{
                        repetir=false;
                    }
                    if (m <=4&&!(m==3)) {
                        if (m<=2){
                            if (m==1){
                                condicion="los ultimos 3 valores han sido 4, 2 y 1";
                            }else {
                                condicion="los ultimos 3 valores no han sido 4, 2 y 1";
                            }
                        }else {
                            condicion="los ultimos 3 valores no han sido 4, 2 y 1";
                        }
                    }else {
                        condicion="los ultimos 3 valores no han sido 4, 2 y 1";
                    }
                }
                System.out.println("Se ha repetido la operacion "+repeticiones+" veces y "+condicion);
            }
        }catch (Exception e){
            System.out.println("Introduce un numero valido");
        }
    }
}
