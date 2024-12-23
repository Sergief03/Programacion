import com.jd.examen.Cocinero;
import com.jd.examen.LibroCocina;
import com.jd.examen.Receta;

public class Ejercicio1 {
    public static void main(String[] args) {
        Cocinero miguel=new Cocinero("Miguel");
        Cocinero joaquin=new Cocinero("Joaquin");

        LibroCocina libroCocinaCasera=LibroCocina.getLibro("Recetas caseras");
        LibroCocina libroCocinaRapida=LibroCocina.getLibro("Comida rápida");
        LibroCocina libroCocinaFaciles=LibroCocina.getLibro("Recetas fáciles");

        Receta pollo= libroCocinaCasera.getReceta("Pollo");
        Receta ensalada=libroCocinaCasera.getReceta("Ensalada mixta");
        Receta helado=libroCocinaRapida.getReceta("Helado");
        Receta tarta=libroCocinaRapida.getReceta("Tarta");
        Receta setas=libroCocinaFaciles.getReceta("Setas");
        Receta lentejas=libroCocinaFaciles.getReceta("Lentejas");
        Receta natillas=libroCocinaFaciles.getReceta("Natillas");
        Receta batido=libroCocinaFaciles.getReceta("Batidos de frutas");
        Receta pizza=libroCocinaRapida.getReceta("Pizza");

        miguel.aprenderReceta(pollo);
        miguel.aprenderReceta(ensalada);
        miguel.aprenderReceta(helado);
        miguel.aprenderReceta(tarta);

        joaquin.aprenderReceta(setas);
        joaquin.aprenderReceta(lentejas);
        joaquin.aprenderReceta(natillas);
        joaquin.aprenderReceta(batido);
        joaquin.aprenderReceta(pizza);
    }
}
