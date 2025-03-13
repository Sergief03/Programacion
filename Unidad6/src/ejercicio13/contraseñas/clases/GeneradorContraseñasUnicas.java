package ejercicio13.contraseñas.clases;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorContraseñasUnicas extends GeneradorContraseñas{
    private Set<String>  contraseñasGeneradas;

    public GeneradorContraseñasUnicas(){
        this(new Random());
    }

    public GeneradorContraseñasUnicas(Random r){
        super(r);
        this.contraseñasGeneradas=new HashSet<>();
    }

    @Override
    public String generarContraseña(int longitud){
        boolean continuar=true;
        String contraseña="";
        while (continuar){
            contraseña=super.generarContraseña(longitud);
            if (!this.contraseñasGeneradas.contains(contraseña)){
                continuar=false;
            }
        }
        this.contraseñasGeneradas.add(contraseña);
        return contraseña;
    }

    @Override
    public String generarContraseña(){
        return this.generarContraseña(12);
    }
}
