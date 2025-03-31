import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.*;

public class ejercicio3 {
    public static void main(String[] args) {
        Runnable hola= () -> System.out.println("Hola mundo");

        Function<Integer, Double> cuadrado= ( num) -> Math.pow(num,2);

        Runnable fecha=() -> System.out.println(LocalDate.now());;

        Predicate<List<Integer>> vacio= ( lista) ->lista.isEmpty();

        Consumer<String> crearArchivo=( ruta) ->{
            File file=new File(ruta);
            if (!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Function<String, Integer> numeroEscapcios=( frase) ->{
            int espacios=0;
            for (int i=0;i<frase.length();i++){
                if (frase.charAt(i)==' '){
                    espacios++;
                }
            }
            return espacios;
        };

        BiFunction<Integer,Integer, Integer> maxNum=(num1,  num2) ->num1>num2? num1:num2;

        Function<Integer,Character> dni=( n)->{
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            return letras.charAt(n % 23);
        };

        Predicate<Integer> mayorEdad=( edad) ->edad>=18;

        Function<String,Long> tamañoBytes=(ruta) ->new File(ruta).length();

        Function<LocalDate,String> fechaString=( ld) ->ld.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));

        Predicate<Integer> esPrimo=( n) ->{
            boolean primo=true;
            if (!(n<=1)){
                for (int i=2;i<n;i++){
                    if (n%i==0){
                        primo=false;
                    }
                }
            }else {
                primo=false;
            }

            return primo;
        };

        Runnable hora=() ->System.out.println(LocalTime.now());


        Consumer<String> lineasArchivo=(ruta)->{
            try {
                BufferedReader bufferedReader=new BufferedReader(new FileReader(ruta));
                String linea="";
                while ((linea=bufferedReader.readLine())!=null){
                    System.out.println(linea);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        Consumer<Integer> sleep=( seg) ->{
            try {
                Thread.sleep(seg*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Function<Character,Integer> ascii=( c)-> (int) c;


        BiPredicate<List<String>,String> contienePalabra=( lista,  palabra)->lista.contains(palabra);

        Function<String, ejercicio1.TipoElemento> tipoElemento = (ruta) -> {
            File archivo = new File(ruta);
            if (!archivo.exists()) {
                throw new IllegalArgumentException("La ruta no existe: " + ruta);
            }
            if (archivo.isFile()) {
                return ejercicio1.TipoElemento.ARCHIVO;
            } else if (archivo.isDirectory()) {
                return ejercicio1.TipoElemento.CARPETA;
            } else {
                throw new IllegalArgumentException("La ruta no es ni un archivo ni una carpeta: " + ruta);
            }
        };

        BiFunction<Integer,Integer,Integer> suma=( num1,  num2)->{
            int operacion=0;
            for (int i=num1;i<=num2;i++){
                operacion+=i;
            }
            return operacion;
        };

        BiConsumer<List<String>,List<String>> copiar=( origen,  destino)->{
            for (String e:origen){
                destino.add(e);
            }
        };
    }
}
