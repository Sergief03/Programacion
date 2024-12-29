import java.util.Scanner;

public class Ejercicio43 {
    public static  void main(String[]args){

        int frecuenciaCardiaca=0;
        int añoActual=2024;

        System.out.println("Introduce tu año de nacimiento:");
        int añoNacimiento=new Scanner(System.in).nextInt();
        System.out.println("Introduce si eres hombre(0) o mujer(1)");
        int sexo=new Scanner(System.in).nextInt();
        System.out.println("Introduce tu altura en metros");
        double altura=new  Scanner(System.in).nextDouble();
        System.out.println("Introduce tu peso en kg:");
        double peso=new Scanner(System.in).nextDouble();

        String estado="";


        if (sexo==0){
             frecuenciaCardiaca=220-(añoActual-añoNacimiento);
        } else if (sexo==1) {
            frecuenciaCardiaca=226-(añoActual-añoNacimiento);

        }else {
            System.out.println("Introduce un valor valido");
        }


        double imc=(peso)/(altura*altura);
        
        if (imc>40){
            estado="Sobrepeso: tipo III";
        } else if (imc>=35) {
            estado="Sobrepeso: tipo II";
        } else if (imc>=30) {
            estado="Sobrepeso: tipo I";
        } else if (imc>=25) {
            estado="Sobrepeso";
        } else if (imc>=18.5) {
            estado="Peso normal";
        } else if (imc>=17) {
            estado="Infrapeso: delgadez aceptable";
        } else if (imc>=16) {
            estado="Infrapeso: delgadez moderada";
        } else  {
            estado="Infrapeso: delgadez severa";
        }


        System.out.println("Tu frecuencia cardiaca maxima es "+ frecuenciaCardiaca+
                "\nTu IMC es "+imc+
                "\nSegun tu IMC tu estado es de "+ estado);


    }
}
