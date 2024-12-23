import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int nota=0;
        int sumaNotas = 0;
        int maxNota = -1;
        int minNota=11;
        int numeroNotas=0;
        while (!(nota==-1)){
            System.out.println("Introduce la nota del alumno sin decimales. Usa -1 para ver las calificaciones");
            nota=new Scanner(System.in).nextInt();
            if (nota!=-1) {
                sumaNotas = sumaNotas + nota;
                numeroNotas++;
                if (maxNota<nota){
                    maxNota=nota;
                }
                if (minNota>nota){
                    minNota=nota;
                }
            }

        }
        System.out.println("La mayor nota es: "+maxNota+
                "\nLa menor nota es: "+minNota+
                "\nLa media es: "+(double)sumaNotas/numeroNotas);
    }
}
