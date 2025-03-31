package ejercicio25.efectosEspeciales.clases;

public class EfectoGuiones implements EfectoEspecial{
    EfectoGuiones(){
        System.out.println("Se ha creado el efecto "+this.getNomrbe());
    }

    @Override
    public final String getNomrbe() {
        return "Efecto Guiones";
    }

    @Override
    public String aplicarEfecto(String frase) {
        StringBuilder respuesta=new StringBuilder();
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==' '){
                respuesta.append("_");
            }else {
                respuesta.append(frase.charAt(i));
            }
        }
        return respuesta.toString();
    }
}
