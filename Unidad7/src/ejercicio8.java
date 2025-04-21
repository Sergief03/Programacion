import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ejercicio8 {
    public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima){
        public DepositoAguaInmutable {
            if (capacidadActual<0 || capacidadMaxima<0){
                throw new IllegalArgumentException("Las cantidaddes deben ser positivas");
            }
            if (capacidadActual > capacidadMaxima) {
                throw new IllegalArgumentException("La capacidad actual no puede ser mayor que la capacidad máxima");
            }
        }

        public DepositoAguaInmutable(int capacidadMaxima) {
            this(0,capacidadMaxima);
            if (capacidadMaxima<0){
                throw new IllegalArgumentException("La cacpacidad maxima no puede ser negativa");
            }
        }

        public DepositoAguaInmutable añadirLitro(){
            return new DepositoAguaInmutable(this.capacidadActual+1,this.capacidadMaxima);
        }

        public DepositoAguaInmutable retirarLitro(){
            return new DepositoAguaInmutable(this.capacidadActual-1,this.capacidadMaxima);
        }

        public int getPorcentaje(){
            return this.capacidadActual*100/capacidadMaxima;
        }
    }

    public static void main(String[] args) {
        //a
        List<String> dias = new ArrayList<>(List.of("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"));
        List<String> diasIngles = new ArrayList<>(List.of("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"));
        dias.replaceAll(dia->diasIngles.get(dias.indexOf(dia)));

        //b
        List<Integer> numeros=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        numeros.replaceAll(num->num*num);

        //c
        List<LocalDate> fechas = new ArrayList<>(List.of(
                LocalDate.of(2024, 3, 1),
                LocalDate.of(2024, 3, 5),
                LocalDate.of(2024, 3, 10),
                LocalDate.of(2024, 3, 15),
                LocalDate.of(2024, 3, 20)
        ));

        fechas.replaceAll(fecha -> LocalDate.of(LocalDate.now().getYear(),fecha.getMonth(),fecha.getDayOfMonth()));

        //d
        List<Rectangle> rectangulos = new ArrayList<>(List.of(
                new Rectangle(10, 20, 30, 40),
                new Rectangle(50, 60, 70, 80),
                new Rectangle(90, 100, 110, 120),
                new Rectangle(130, 140, 150, 160),
                new Rectangle(170, 180, 190, 200)
        ));

        rectangulos.replaceAll(rect ->new Rectangle(rect.x,rect.y, rect.height,rect.width));

        //e
        List<String> palabras=new ArrayList<>(List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"));
        palabras.replaceAll(p -> new StringBuilder(p).reverse().toString());

        //f
        List<DepositoAguaInmutable> depositos =new ArrayList<>(List.of(
                new DepositoAguaInmutable(5, 20),
                new DepositoAguaInmutable(10, 50),
                new DepositoAguaInmutable(0, 30),
                new DepositoAguaInmutable(25, 25),
                new DepositoAguaInmutable(15, 100))
        );

        depositos.replaceAll(deposito->deposito.añadirLitro());
    }
}
