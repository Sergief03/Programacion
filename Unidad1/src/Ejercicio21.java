import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[]args){
        int teoria=40;
        int problemas=60;
        System.out.println("Indica cuantas de las 8 preguntas de teoria y los 4 problemas respectivamente has tenido bien en el examen:");
        int teoriaAcertada= new Scanner(System.in).nextInt();
        int problemasAcertada= new Scanner(System.in).nextInt();
        int notaTeoria= (teoriaAcertada*10/8);
        int notaProblemas= (problemasAcertada*10/4);
        System.out.println("Nota de teoria: "+notaTeoria);
        System.out.println("Nota de problemas: "+notaProblemas);
        System.out.println("Nota de examen: "+(notaTeoria*(teoria*0.01)+notaProblemas*(problemas*0.01)));
    }
}
