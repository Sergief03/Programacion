package ejercicio25.efectosEspeciales.clases;

public class EfectoCorchetes implements Simetrico,EfectoEspecial {
    EfectoCorchetes(){
        System.out.println("Se ha creado el efecto "+this.getNomrbe());
    }

    @Override
    public final String getNomrbe() {
        return "Efecto Corchetes";
    }

    @Override
    public String aplicarEfecto(String frase) {
        String respuesta="";
        if (frase.charAt(0)=='['&&frase.charAt(frase.length()-1)==']'){
            respuesta=frase.substring(1,frase.length()-1);
        }else {
            respuesta="["+frase+"]";
        }
        return respuesta;
    }
}
