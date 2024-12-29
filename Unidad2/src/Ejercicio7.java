import bpc.daw.objetos.DepositoAgua;

public class Ejercicio7 {
    public static void main(String[] args) {
        DepositoAgua depositoAgua= new DepositoAgua(15,50);
        depositoAgua.dibujar();

        double porcentaje=((double)depositoAgua.getCantidadActual()/depositoAgua.getCapacidadMaxima())*100;
        System.out.println(porcentaje);
    }
}
