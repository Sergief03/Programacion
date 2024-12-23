import bpc.daw.objetos.DepositoAgua;

public class Ejercicio19 {
    public static void main(String[] args) {
        DepositoAgua depositoAgua=new DepositoAgua(0,1000);
        depositoAgua.dibujar();
        for (int i=0;i<1001;i++){
            depositoAgua.añadirLitro();
        }
        depositoAgua.dibujar();
    }
}
