import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.*;

public class ejercicio1 {
    enum TipoElemento {
        ARCHIVO,
        CARPETA
    }

    public static void main(String[] args) {
        // Función pura: No tiene efectos secundarios, solo devuelve el valor calculado.
        Runnable hola = () -> {
            System.out.println("Hola mundo"); // Efecto secundario: salida por consola
        };

// Función pura: Calcula el cuadrado de un número sin efectos secundarios.
        Function<Integer, Double> cuadrado = (Integer num) -> {
            return Math.pow(num, 2); // Pura, ya que solo realiza una operación matemática sin efectos secundarios.
        };

// Función no pura: Tiene un efecto secundario al imprimir la fecha en la consola.
        Runnable fecha = () -> {
            System.out.println(LocalDate.now()); // Efecto secundario: salida por consola
        };

// Función pura: Solo verifica si la lista está vacía, sin modificar su estado.
        Predicate<List<Integer>> vacio = (List<Integer> lista) -> {
            return lista.isEmpty(); // Pura, ya que solo devuelve un valor booleano sin modificar el estado.
        };

// Función no pura: Crea un archivo en el sistema de archivos si no existe, efecto secundario de creación de archivo.
        Consumer<String> crearArchivo = (String ruta) -> {
            File file = new File(ruta);
            if (!file.exists()) {
                try {
                    file.createNewFile(); // Efecto secundario: crea un archivo en el sistema de archivos
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };

// Función pura: Cuenta la cantidad de espacios en una cadena sin efectos secundarios.
        Function<String, Integer> numeroEscapcios = (String frase) -> {
            int espacios = 0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == ' ') {
                    espacios++;
                }
            }
            return espacios; // Pura, ya que solo cuenta los espacios sin efectos secundarios.
        };

// Función pura: Devuelve el máximo de dos números sin efectos secundarios.
        BiFunction<Integer, Integer, Integer> maxNum = (Integer num1, Integer num2) -> {
            return num1 > num2 ? num1 : num2; // Pura, ya que solo devuelve un valor sin efectos secundarios.
        };

// Función pura: Calcula la letra del DNI a partir del número sin efectos secundarios.
        Function<Integer, Character> dni = (Integer n) -> {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            return letras.charAt(n % 23); // Pura, ya que solo realiza un cálculo sin efectos secundarios.
        };

// Función pura: Verifica si una edad es mayor o igual a 18 sin modificar nada.
        Predicate<Integer> mayorEdad = (Integer edad) -> {
            return edad >= 18; // Pura, solo devuelve un valor booleano sin efectos secundarios.
        };

// Función no pura: Obtiene el tamaño de un archivo en el sistema de archivos, tiene un efecto secundario.
        Function<String, Long> tamañoBytes = (String ruta) -> {
            return new File(ruta).length(); // Efecto secundario: consulta el sistema de archivos.
        };

// Función pura: Convierte una fecha en un string con formato, sin efectos secundarios.
        Function<LocalDate, String> fechaString = (LocalDate ld) -> {
            return ld.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")); // Pura, solo realiza un formato sin efectos secundarios.
        };

// Función pura: Verifica si un número es primo, sin efectos secundarios.
        Predicate<Integer> esPrimo = (Integer n) -> {
            boolean primo = true;
            if (!(n <= 1)) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        primo = false;
                    }
                }
            } else {
                primo = false;
            }
            return primo; // Pura, ya que solo calcula un valor booleano sin efectos secundarios.
        };

// Función no pura: Imprime la hora actual en consola, efecto secundario de salida por consola.
        Runnable hora = () -> {
            System.out.println(LocalTime.now()); // Efecto secundario: salida por consola
        };

// Función no pura: Lee las líneas de un archivo y las imprime, tiene efectos secundarios de I/O.
        Consumer<String> lineasArchivo = (String ruta) -> {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta));
                String linea = "";
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea); // Efecto secundario: salida por consola
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

// Función no pura: Suspende el hilo durante un número de segundos, efecto secundario de ejecución de hilo.
        Consumer<Integer> sleep = (Integer seg) -> {
            try {
                Thread.sleep(seg * 1000); // Efecto secundario: suspende el hilo durante el tiempo indicado
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

// Función pura: Convierte un carácter en su valor ASCII, sin efectos secundarios.
        Function<Character, Integer> ascii = (Character c) -> {
            return (int) c; // Pura, ya que solo realiza una conversión sin efectos secundarios.
        };

// Función pura: Verifica si una lista contiene una palabra, sin efectos secundarios.
        BiPredicate<List<String>, String> contienePalabra = (List<String> lista, String palabra) -> {
            return lista.contains(palabra); // Pura, ya que solo devuelve un valor booleano sin efectos secundarios.
        };

// Función no pura: Lanza una excepción si la ruta no es válida, tiene un efecto secundario de validación de archivo.
        Function<String, TipoElemento> tipoElemento = (String ruta) -> {
            File archivo = new File(ruta);
            if (!archivo.exists()) {
                throw new IllegalArgumentException("La ruta no existe: " + ruta); // Efecto secundario: lanza una excepción
            }
            if (archivo.isFile()) {
                return TipoElemento.ARCHIVO;
            } else if (archivo.isDirectory()) {
                return TipoElemento.CARPETA;
            } else {
                throw new IllegalArgumentException("La ruta no es ni un archivo ni una carpeta: " + ruta); // Efecto secundario: lanza una excepción
            }
        };

// Función pura: Suma los números entre dos valores, sin efectos secundarios.
        BiFunction<Integer, Integer, Integer> suma = (Integer num1, Integer num2) -> {
            int operacion = 0;
            for (int i = num1; i <= num2; i++) {
                operacion += i;
            }
            return operacion; // Pura, ya que solo realiza un cálculo sin efectos secundarios.
        };

// Función no pura: Copia elementos de una lista a otra, tiene efectos secundarios al modificar las listas.
        BiConsumer<List<String>, List<String>> copiar = (List<String> origen, List<String> destino) -> {
            for (String e : origen) {
                destino.add(e); // Efecto secundario: modifica la lista destino
            }
        };




        //ejercicio2
        // a) Mostrar en pantalla la frase "hola mundo"
        hola.run();

        // b) Calcular el cuadrado de 25
        double resultadoCuadrado = cuadrado.apply(25);
        System.out.println("El cuadrado de 25 es: " + resultadoCuadrado);

        // c) Mostrar en pantalla la hora actual
        hora.run();

        // d) Crear un archivo llamado prueba.txt
        crearArchivo.accept("prueba.txt");

        // e) Comprobar que la frase "viva el tema 7" tiene 3 espacios
        int espacios = numeroEscapcios.apply("viva el tema 7");
        System.out.println("Número de espacios en 'viva el tema 7': " + espacios);

        // f) Calcular el mayor de los números 100 y 235
        int mayorNumero = maxNum.apply(100, 235);
        System.out.println("El mayor número entre 100 y 235 es: " + mayorNumero);

        // g) Sacar la letra del dni 11111111
        char letraDni = dni.apply(11111111);
        System.out.println("La letra del DNI 11111111 es: " + letraDni);

        // h) Comprobar que 15 años no es mayor de edad
        boolean esMayorEdad = mayorEdad.test(15);
        System.out.println("¿15 años es mayor de edad? " + esMayorEdad);

        // i) Obtener la fecha actual en formato día/mes/año
        String fechaFormato = fechaString.apply(LocalDate.now());
        System.out.println("La fecha actual es: " + fechaFormato);

        // j) Comprobar que el número 30 no es primo y el 7 sí lo es
        boolean esPrimo30 = esPrimo.test(30);
        boolean esPrimo7 = esPrimo.test(7);
        System.out.println("¿30 es primo? " + esPrimo30);
        System.out.println("¿7 es primo? " + esPrimo7);

        // k) Hacer una pausa de 5 segundos
        sleep.accept(5);

        // I) Obtener el código ASCII de la letra L
        int codigoAscii = ascii.apply('L');
        System.out.println("El código ASCII de la letra 'L' es: " + codigoAscii);

        // m) Comprobar que "martes" está dentro de la lista de palabras con los días de la semana
        List<String> diasSemana = List.of("lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo");
        boolean contieneMartes = contienePalabra.test(diasSemana, "martes");
        System.out.println("¿La lista contiene 'martes'? " + contieneMartes);

        // n) Comprobar que c:\\windows es una carpeta
        try {
            TipoElemento tipo = tipoElemento.apply("C:\\Windows");
            System.out.println("La ruta 'C:\\Windows' es una: " + tipo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // o) Obtener la suma de todos los números comprendidos entre 5 y 28 (ambos incluidos)
        int sumaResultado = suma.apply(5, 28);
        System.out.println("La suma de los números entre 5 y 28 es: " + sumaResultado);
    }
}
