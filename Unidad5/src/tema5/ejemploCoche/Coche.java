package tema5.ejemploCoche;

import java.util.Random;

public class Coche {
    public String marca;
    public String matricula;
    public int velocidad;

    public Coche(String matricula, String marca, int velocidad) {
        this.marca = marca;
        this.matricula = matricula;
        if (velocidad < 0) {
            this.velocidad = 0;
        } else {
            this.velocidad = velocidad;
        }
    }

    public Coche(String marca){
        this(new Random().nextInt(1111,9999)+"XYZ",marca,0);
    }

    public void setVelocidad(int v){
        this.velocidad=v<0? 100:v;
    }

    public void detener(){
        this.velocidad=0;
    }

    public void matricular(String m){
        this.matricular(m.substring(0,3),m.toCharArray());
    }

    public void matricular(String numero,char[]letras){
        if (numero.matches("^[0-9]{4}")){
            this.matricula=numero;
        }
        if (letras.length==3){
            for (int i=0;i<letras.length;i++){
                if (Character.toString(letras[i]).matches("[A-Z]")){
                    this.matricula+=letras[i];
                }
            }
        }
    }

    public void setMarca(String m){
        String [] marcas={"Ferrari", "BMW", "Audi", "Mercedes", "Toyota", "Skoda", "Nissan", "Renault"};
        boolean marcaValida=false;
        for(int i=0;i<marcas.length;i++){
            if (m.equalsIgnoreCase(marcas[i])){
                marcaValida=true;
            }
        }
        if (marcaValida){
            this.marca=m;
        }else {
            this.marca="DESCONOCIDO";
        }
    }
}
