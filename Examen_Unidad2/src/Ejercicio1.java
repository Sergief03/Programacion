import bpc.examen.menganito.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.Duration;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Menganito menganito=new Menganito();
        String arrozJamon="arroz con tomate y jamón";

        String nombre=menganito.hacerPregunta("¿cómo te llamas?");
        String gustaComer=menganito.hacerPregunta("¿qué te gusta comer?");
        String quiereComer=menganito.hacerPregunta("¿qué quieres comer?");
        String horaComer=menganito.hacerPregunta("¿antes de qué hora quieres comer?");
        String pista=menganito.hacerPregunta("dame una pista");

        System.out.println(nombre+"\n"+gustaComer+"\n"+quiereComer+"\n"+horaComer+"\n"+pista);

        if (arrozJamon.equals(quiereComer.substring(24))){
            try {
                Arroz arroz=new Arroz("Quijote");
                IngredienteAdapter arrozAdaptado=new IngredienteAdapter(arroz,200);
                Tomate tomate=new Tomate(250, TomateStyle.getTomateStyle(TomateStyle.CUADRADITOS));
                Jamon jamon=new Jamon(5,2,true);

                RobotCocina robotCocina=new RobotCocina();
                robotCocina.setPrograma(2);

                Duration duration=robotCocina.getDuracionReceta();

                TarroCaramelos tarroCaramelos=TarroCaramelos.getTarroCaramelos();

                robotCocina.añadir(arrozAdaptado);
                robotCocina.añadir(jamon);
                robotCocina.añadir(tomate);
                robotCocina.cocinar();

                Thread.sleep(duration.toSeconds()*1000);

                PlatoCocinado platoCocinado= robotCocina.sacarPlato();
                platoCocinado.enfriar(platoCocinado.getTemperatura()-37);

                Comida comida=platoCocinado.getComida();

                Prenda chupete=Prenda.getPrenda(Prenda.CHUPETE);
                Prenda gorra=Prenda.getPrenda(Prenda.GORRA);

                menganito.vestir(chupete,false);
                menganito.vestir(gorra,false);

                if (duration.toSeconds()<5){
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                }else if (duration.toSeconds()>5){
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                } else if (duration.toSeconds()>10) {
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                }else if (duration.toSeconds()>15){
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                }

                menganito.comer(comida);

                System.out.println(menganito.hacerPregunta("¿te ha gustado tu comida?"));

                PrintWriter printWriter=new PrintWriter("informacionNutricional.txt");

                Map map=comida.getInformacionNutricional();

                printWriter.println("Azúcar: "+map.get("azúcar"));
                printWriter.println("Proteínas: "+map.get("proteínas"));
                printWriter.println("Grasas: "+map.get("grasa"));
                printWriter.println("Fibra: "+map.get("fibra"));

                printWriter.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }catch (IOException e){
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }else {
            try {
                Lentejas lentejas=new Lentejas();
                IngredienteAdapter lentejasAdaptadas=new IngredienteAdapter(lentejas,425);
                Tomate tomate=new Tomate(300,TomateStyle.getTomateStyle(TomateStyle.CUARTOS));
                Zanahoria zanahoria=new Zanahoria(4,true, true, false);

                RobotCocina robotCocina=new RobotCocina();
                robotCocina.setPrograma(5);
                robotCocina.añadir(lentejasAdaptadas);
                robotCocina.añadir(tomate);
                robotCocina.añadir(zanahoria);
                robotCocina.cocinar();

                Duration duration=robotCocina.getDuracionReceta();

                Thread.sleep(duration.toSeconds()*1000);

                PlatoCocinado platoCocinado= robotCocina.sacarPlato();
                platoCocinado.enfriar(platoCocinado.getTemperatura()-37);

                TarroCaramelos tarroCaramelos=TarroCaramelos.getTarroCaramelos();
                if (duration.toSeconds()<5){
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                }else if (duration.toSeconds()>5){
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                } else if (duration.toSeconds()>10) {
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                }else if (duration.toSeconds()>15){
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                    menganito.comer(tarroCaramelos.sacarCaramelo());
                }


                Comida comida=platoCocinado.getComida();

                Prenda chupete=Prenda.getPrenda(Prenda.CHUPETE);
                Prenda gorra=Prenda.getPrenda(Prenda.GORRA);

                menganito.vestir(chupete,false);
                menganito.vestir(gorra,false);

                menganito.comer(comida);

                System.out.println(menganito.hacerPregunta("¿te ha gustado tu comida?"));

                PrintWriter printWriter=new PrintWriter("informacionNutricional.txt");

                Map map=comida.getInformacionNutricional();

                printWriter.println("Azúcar: "+map.get("azúcar"));
                printWriter.println("Proteínas: "+map.get("proteínas"));
                printWriter.println("Grasas: "+map.get("grasa"));
                printWriter.println("Fibra: "+map.get("fibra"));

                printWriter.close();


            }catch (IOException e){
                System.out.println(e.getMessage());
            } catch (ZanahoriaException e) {
                System.out.println(e.getMessage());
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}