package ejercicio13.contraseñas.clases;

import java.util.Random;

public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnicas{
    public GeneradorContraseñasInvertidas(){
        this(new Random());
    }

    public GeneradorContraseñasInvertidas(Random r){
        super(r);
    }

    @Override
    public String generarContraseña(int longitud){
        String contraseña=super.generarContraseña(longitud);
        StringBuilder contraseñaInvertida=new StringBuilder();
        for (int i=0;i<contraseña.length();i++){
            if (contraseña.charAt(i)>=65&&contraseña.charAt(i)<=90){
                contraseñaInvertida.append((char)(contraseña.charAt(i)+32));
            } else if (contraseña.charAt(i)>=97&&contraseña.charAt(i)<=122) {
                contraseñaInvertida.append((char)(contraseña.charAt(i)-32));
            }else {
                contraseñaInvertida.append(contraseña.charAt(i));
            }
        }
        return contraseñaInvertida.toString();
    }
}
