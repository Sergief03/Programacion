public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.println("Para la siguiente ecuacion 2*x^3-5*x^2-9*x+18=0, los resultados aproximados son los siguientes: ");
        for (double i = -100; i < 100; i += 0.001) {
            double ecuacion = 2 * Math.pow(i, 3) - 5 * Math.pow(i, 2) - 9 * i + 18;
            if (Math.abs(ecuacion)<0.00005){
                System.out.println("x="+i);
            }
        }
    }
}