import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Gson gson=new Gson();

        try {
            FileReader fileReader=new FileReader("personas.json");
            Map<String,String> archivo=gson.fromJson(fileReader,Map.class);
            fileReader.close();
            boolean continuar=true;
            String persona="";
            String comida="";


            while (continuar){

                System.out.println("""
                        Elige una opcion:
                        1) Añadir persona
                        2) Consultar persona
                        3) Mostrar todas las personas
                        4) Guardar
                        5) Salir
                        """);
                int eleccion=new Scanner(System.in).nextInt();
                if (eleccion>0&&eleccion<=5){
                    switch (eleccion){
                        case 1->{
                            System.out.println("Introduce el nombre de una persona:");
                            persona=new Scanner(System.in).nextLine();
                            System.out.println("Introduce su comida favorita:");
                            comida=new Scanner(System.in).nextLine();
                            archivo.put(persona,comida);
                        }
                        case 2->{
                            System.out.println("Introduce el nombre de una persona:");
                            persona=new Scanner(System.in).nextLine();
                            if (archivo.containsKey(persona)) {
                                System.out.println("A "+persona+" le gusta comer "+archivo.get(persona));
                            }else {
                                System.out.println("Introduce el nombre de una persona valida");
                            }
                        }
                        case 3->{
                            for (String e:archivo.keySet()){
                                System.out.println(e+": "+archivo.get(e));
                            }
                        }
                        case 4->{
                            FileWriter fileWriter=new FileWriter("personas.json");
                            gson.toJson(archivo,fileWriter);
                            fileWriter.close();
                        }
                        case 5->{
                            continuar=false;
                        }
                    }
                }else {
                    System.out.println("Elige una opcion valida");
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
