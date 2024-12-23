import bpc.daw.objetos.MarcadorBaloncesto;

public class Ejercicio12 {
    public static void main(String[] args) {
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Estudiantes","CB Granada");

        marcadorBaloncesto.anotarCanasta('E',2);
        System.out.println(marcadorBaloncesto.getPuntosLocal());
    }
}
