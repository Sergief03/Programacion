import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Extra {
    //crea un map para almacenar la nota de unos alumnos de la clase y obtener la nota de cada uno de ellos
    //crea un menu iterativo con la siguientes opciones
    //0-Salir -1Añadir un nuevo alumno -2Preguntar por un alumno existente -3Consultar el numero total de alumnos registrados
    //4-Mostrar en pantalla todos alumnos consus notas -5Guardar en un archivo datos.csv las notas de los alumnos (nombre;nota)
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Francisco", 9);
        notas.put("Jose", 6);
        notas.put("Maria", 4);
        notas.put("Ruben", 8);
        boolean continuar = true;
        String nuevoAlumno="";
        int notaNuevoAlumno=0;
        int eleccion=0;

        while (continuar) {
            System.out.println("Elige una opcion:\n0) Salir\n1) Añadir nuevo alumno" +
                    "\n2) Preguntar por un alumno\n3) Consultar el numero de almunos" +
                    "\n4)Mostrar alumnos y sus notas\n5) Guardar en un archivo los alumnos y sus notas");
            eleccion = new Scanner(System.in).nextInt();

            switch (eleccion) {
                case 0 -> {
                    continuar = false;
                }
                case 1 -> {
                    System.out.println("Introduce el nombre del nuevo alumno:");
                    nuevoAlumno=new Scanner(System.in).nextLine();
                    System.out.println("Introduce una nota para ese alumno: ");
                    notaNuevoAlumno=new Scanner(System.in).nextInt();

                    notas.put(nuevoAlumno,notaNuevoAlumno);
                }
                case 2 -> {
                    System.out.println("Introduce el nombre del alumno: ");
                    nuevoAlumno=new Scanner(System.in).nextLine();
                    System.out.println("El alumno "+nuevoAlumno+(notas.containsKey(nuevoAlumno)? " esta entre los alumnos":" no esta entre los alumnos"));
                }
                case 3 -> {
                    System.out.println("EL numero de alumnos es: "+notas.size());
                }
                case 4 -> {
                    for (String e:notas.keySet()){
                        System.out.println(e+": "+notas.get(e));
                    }
                }
                case 5 -> {
                    try {
                        PrintWriter printWriter=new PrintWriter("datos.csv");
                        for (String e:notas.keySet()){
                            printWriter.println(e+";"+notas.get(e));
                        }
                        printWriter.close();
                        System.out.println("Archivo guardado");
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                }
                default -> System.out.println("Introduce un numero valido");
            }
        }
    }
}