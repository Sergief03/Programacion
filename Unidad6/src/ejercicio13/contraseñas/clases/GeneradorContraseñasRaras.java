package ejercicio13.contraseñas.clases;

import java.util.Random;

public class GeneradorContraseñasRaras extends GeneradorContraseñas{
    public GeneradorContraseñasRaras(){
        super();
    }
    public GeneradorContraseñasRaras(Random r){
        super(r);
    }

    public String generadorContraseñas(int longitud){
        String contraseña=super.generarContraseña(longitud);
        StringBuilder contraseñaRara=new StringBuilder();
        for (int i=0;i<contraseña.length();i++){
            contraseñaRara.append((char)contraseña.charAt(i)+122);
        }
        return contraseñaRara.toString();
    }
}
