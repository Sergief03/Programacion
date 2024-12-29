public class Ejercicio22 {
    public static void main(String[]args){
        final double NOTA_MAXIMA=10;
        final int ERRORES=3;

        int preguntas = 30;
        int preguntasBien = 22;
        int preguntasMal = 6;
        int preguntasSinContestar = 2;

        int penalizacion = preguntasMal / ERRORES;
        int preguntasTotal = preguntasBien - penalizacion;
        double notaFinal=(preguntasTotal*NOTA_MAXIMA)/preguntas;

        System.out.println("La nota del alumno es: " + notaFinal);
    }
}
