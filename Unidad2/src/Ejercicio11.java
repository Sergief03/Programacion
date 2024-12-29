import bpc.daw.objetos.Caja;

public class Ejercicio11 {
    public static void main(String[] args) {
        Caja caja1=new Caja("Mensaje caja 1");
        Caja caja2=new Caja("Mensaje caja 2");

        caja1.abrirCaja();
        caja2.abrirCaja();

        System.out.println(caja1.getMensaje());
        System.out.println(caja2.getMensaje());

        caja2.cambiarMensaje(caja1.getMensaje());
        caja1.cambiarMensaje(caja2.getMensaje());

        System.out.println(caja1.getMensaje());
        System.out.println(caja2.getMensaje());

    }
}
