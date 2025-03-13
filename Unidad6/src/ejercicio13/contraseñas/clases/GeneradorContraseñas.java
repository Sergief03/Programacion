package ejercicio13.contraseñas.clases;



import java.util.Random;

public class GeneradorContraseñas {
    private Random random;

    public GeneradorContraseñas(){
        this(new Random());
    }

    public GeneradorContraseñas(Random r){
        this.random=r;
    }

    public String generarContraseña(int longitud){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<longitud;i++){
            switch (this.random.nextInt(3)){
                case 0->stringBuilder.append((char)this.random.nextInt(48,57));
                case 1->stringBuilder.append((char)this.random.nextInt(65,90));
                case 2->stringBuilder.append((char)this.random.nextInt(97,122));

            }
        }
        return stringBuilder.toString();
    }

    public String generarContraseña(){
        return this.generarContraseña(8);
    }
}
