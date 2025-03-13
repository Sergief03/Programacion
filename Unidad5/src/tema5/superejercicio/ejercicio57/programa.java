package tema5.superejercicio.ejercicio57;

import tema5.superejercicio.ejercicio50.Estado;
import tema5.superejercicio.ejercicio51.Titulo;
import tema5.superejercicio.ejercicio52.CatalogoTitulos;
import tema5.superejercicio.ejercicio54.CatalogoTitulosArchivo;
import tema5.superejercicio.ejercicio55.TipoCatalogo;
import tema5.superejercicio.ejercicio56.CatalogoTitulosFactory;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        CatalogoTitulos catalogoTitulos= CatalogoTitulosFactory.getCatalogoTitulos(TipoCatalogo.ARCHIVO);
        boolean continuar=true;
        while (continuar){
            System.out.println("""
                    Elige una opcion:
                    1. Añadir titulo
                    2. Consultar todos los titulos
                    3. Cambiar estado del titulo
                    4. Salir
                    """);
            String opcion=new Scanner(System.in).nextLine();
            if (opcion.matches("^[1-4]$")){
                switch (opcion){
                    case "1"->{
                        System.out.println("Introduce un numero de dni:");
                        String dni=new Scanner(System.in).nextLine();

                        System.out.println("Introduce un nombre:");
                        String nombre=new Scanner(System.in).nextLine();

                        System.out.println("Introduce el nombre de los estudios que tiene la persona:");
                        String estudios=new Scanner(System.in).nextLine();

                        Estado estado=null;
                        while (continuar){
                            System.out.println("Introduce el numero de un estado(1-Sin recibir, 2-Recibido, 3-Recogido): ");
                            String estadoNombre=new Scanner(System.in).nextLine();


                            if (estadoNombre.matches("^[1-3]$")){
                                switch (estadoNombre){
                                    case "1"->estado=Estado.SIN_RECIBIR;
                                    case "2"->estado=Estado.RECIBIDO;
                                    case "3"->estado=Estado.RECOGIDO;
                                }
                                continuar=false;
                            }else {
                                System.out.println("introduce una opcion valida");
                            }


                        }
                        continuar=true;

                        catalogoTitulos.añadirTitulo(dni,nombre,estudios,estado);
                    }
                    case "2"->{
                        for (Titulo e: catalogoTitulos.getTitulos()){
                            System.out.println(e.toString());
                        }
                    }
                    case  "3"->{
                        String dni="";
                        Titulo titulo=null;
                        while (continuar){
                            System.out.println("Introduce un dni de un titulo: ");
                            dni=new Scanner(System.in).nextLine();
                            if (dni.matches("^\\d{8}[A-Z]$")){
                                try{
                                    titulo= catalogoTitulos.getTitulo(dni);
                                    continuar=false;
                                }catch (NoSuchElementException e){
                                    System.out.println("No se encuentra el titulo");
                                }

                            }else {
                                System.out.println("Introduce un dni valido");
                            }
                        }

                        continuar=true;

                        System.out.println("El estado del titulo es "+titulo.getEstado()+
                                "\n Que estado le quieres dar (1-Sin recibir, 2-Recibido, 3-Recogido):");

                        Estado estado=null;
                        while (continuar) {
                            String estadoNombre = new Scanner(System.in).nextLine();


                            if (estadoNombre.matches("^[1-3]$")) {
                                switch (estadoNombre) {
                                    case "1" -> estado = Estado.SIN_RECIBIR;
                                    case "2" -> estado = Estado.RECIBIDO;
                                    case "3" -> estado = Estado.RECOGIDO;
                                }
                                continuar = false;
                            } else {
                                System.out.println("introduce una opcion valida");
                            }


                        }
                        continuar=true;
                        titulo.setEstado(estado);
                    }
                    case "4"->{
                        catalogoTitulos.guardar();
                        continuar=false;
                    }
                }
            }else {
                System.out.println("Elige una opcion valida ");
            }
        }
    }
}
