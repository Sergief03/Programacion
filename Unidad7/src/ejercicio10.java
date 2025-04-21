import java.util.function.BiFunction;

public class ejercicio10 {
    public record CorreccionExamen(String alumno, int numeroPreguntas, int respuestasCorrectas){
        public CorreccionExamen{
            if (numeroPreguntas <= 0 || respuestasCorrectas < 0 || respuestasCorrectas > numeroPreguntas) {
                throw new IllegalArgumentException("El número de preguntas debe ser positivo y el número de respuestas correctas debe ser válido.");
            }
        }
        public int respuestasInCorrectas(){
            return this.respuestasInCorrectas();
        }
        public double getNota(BiFunction<Integer,Integer, Double> criterioCorreccion){
            return criterioCorreccion.apply(respuestasCorrectas(),numeroPreguntas()-respuestasCorrectas());
        };
    }

    public static void main(String[] args) {
        CorreccionExamen correccionExamen=new CorreccionExamen("Pepe",12,8);
        BiFunction<Integer, Integer, Double> a = (correctas, incorrectas) -> (double) correctas/(correctas+incorrectas)*10;
        System.out.println(correccionExamen.getNota(a));
        BiFunction<Integer,Integer,Double> b = (correctas, incorrectas) -> (double) (correctas - incorrectas) / (correctas+incorrectas) * 10;
        System.out.println(correccionExamen.getNota(b));
        BiFunction<Integer,Integer,Double> c = (correctas, incorrectas) -> (correctas - (incorrectas*0.5)) / (correctas+incorrectas) * 10;
        System.out.println(correccionExamen.getNota(c));
    }
}
