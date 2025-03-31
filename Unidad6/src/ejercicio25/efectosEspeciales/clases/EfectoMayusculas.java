package ejercicio25.efectosEspeciales.clases;

public class EfectoMayusculas implements EfectoEspecial{
    EfectoMayusculas(){
        System.out.println("Se ha creado el efecto "+this.getNomrbe());
    }


    @Override
    public final String getNomrbe() {
        return "Efecto Especial";
    }

    @Override
    public String aplicarEfecto(String frase) {
        return frase.toUpperCase();
    }
}
