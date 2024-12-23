import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        String contraseña="hola";
        String contraseñaUsuario="";
        boolean acceso=false;
        for (int i=0;i<5&&!contraseña.equals(contraseñaUsuario);i++){
            System.out.println("Introduce la contraseña");
            contraseñaUsuario=new Scanner(System.in).nextLine();
            if (contraseñaUsuario.equals(contraseña)) {
                System.out.println("Acceso permitido");
                acceso=true;
            }
        }
        if (!acceso){
            System.out.println("Acceso denegado");
        }
    }
}
