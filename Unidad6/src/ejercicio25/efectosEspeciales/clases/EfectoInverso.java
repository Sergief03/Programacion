package ejercicio25.efectosEspeciales.clases;

public class EfectoInverso implements Simetrico,EfectoEspecial{
    EfectoInverso(){
        System.out.println("Se ha creado el efecto "+this.getNomrbe());
    }

    @Override
    public final String getNomrbe() {
        return "Efecto Inverso";
    }

    @Override
    public String aplicarEfecto(String frase) {
        StringBuilder respuesta=new StringBuilder();
        for (int i=frase.length();i>0;i--){
            respuesta.append(frase.charAt(i-1));
        }
        return respuesta.toString();
    }
}
