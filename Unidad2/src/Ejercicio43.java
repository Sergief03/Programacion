import java.text.NumberFormat;

public class Ejercicio43 {
    public static void main(String[] args) {
        double calculo=4*Math.atan(1);
        NumberFormat decimales= NumberFormat.getInstance();
        decimales.setMaximumIntegerDigits(4);
        decimales.setMinimumFractionDigits(4);

        System.out.println("valor de pi: "+ decimales.format(calculo));

    }
}
