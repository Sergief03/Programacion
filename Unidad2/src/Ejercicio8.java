import bpc.daw.objetos.DepositoAgua;

public class Ejercicio8 {
    public static void main(String[] args) {
        DepositoAgua depositoAgua1= new DepositoAgua(15,20);
        DepositoAgua depositoAgua2= new DepositoAgua(5,20);

        depositoAgua1.dibujar();
        depositoAgua2.dibujar();

        depositoAgua1.retirarLitro();
        depositoAgua1.retirarLitro();
        depositoAgua1.retirarLitro();
        depositoAgua1.retirarLitro();
        depositoAgua1.retirarLitro();

        depositoAgua2.añadirLitro();
        depositoAgua2.añadirLitro();
        depositoAgua2.añadirLitro();
        depositoAgua2.añadirLitro();
        depositoAgua2.añadirLitro();

        depositoAgua1.dibujar();
        depositoAgua2.dibujar();


    }
}
