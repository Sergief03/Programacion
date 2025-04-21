import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio12 {
    public enum Proposito{
        WEB,MOVIL,ESCRITORIO,MULTIPROPOSITO;
    }

    public record Lenguaje( String nombre, Proposito proposito){

    }

    public record Programador(String nombre, int experiencia, List<Lenguaje> lenguajes){

    }

    public record Proyecto(String nombre, List<Programador> equipo){

    }

    public static void main(String[] args) {
        Programador luis = new Programador("Luis González", 5,
                List.of(new Lenguaje("C++", Proposito.MULTIPROPOSITO),
                        new Lenguaje("PHP", Proposito.WEB)));

        Programador antonio = new Programador("Antonio Pérez", 2,
                List.of(new Lenguaje("Java", Proposito.MULTIPROPOSITO),
                        new Lenguaje("Python", Proposito.MULTIPROPOSITO)));

        Programador juana = new Programador("Juana López", 4,
                List.of(new Lenguaje("Visual Basic", Proposito.ESCRITORIO),
                        new Lenguaje("Swift", Proposito.MOVIL)));

        Programador josefa = new Programador("Josefa Smith", 3,
                List.of(new Lenguaje("ASP", Proposito.WEB),
                        new Lenguaje("Java", Proposito.MULTIPROPOSITO),
                        new Lenguaje("Dart", Proposito.MOVIL)));
        List<Programador> programadores = List.of(luis, antonio, juana, josefa);

        // Lista de proyectos
        Proyecto banco = new Proyecto("Banco Granada", List.of(luis, juana, josefa));
        Proyecto merca = new Proyecto("MercaRafa", List.of(antonio, luis, josefa));
        Proyecto jorge = new Proyecto("JorgePhone", List.of(antonio, juana));

        List<Proyecto> proyectos = List.of(banco, merca, jorge);

        // a)
        System.out.println("a) Programadores con más de 3 años de experiencia:");
        programadores.stream()
                .filter(p -> p.experiencia() > 3)
                .forEach(p -> System.out.println(p.nombre()));

        // b)
        System.out.println("\nb) Sueldo de programadores:");
        programadores.stream()
                .forEach(p -> {
                    int sueldo = p.experiencia() * 900 + p.lenguajes().size() * 100;
                    System.out.println(p.nombre() + ": " + sueldo + " €");
                });

        // c)
        System.out.println("\nc) Menor experiencia en MercaRafa:");
        merca.equipo().stream()
                .min(Comparator.comparingInt(p -> p.experiencia()))
                .ifPresent(p -> System.out.println(p.nombre()));

        // d)
        System.out.println("\nd) Lenguajes del programador con menos experiencia:");
        programadores.stream()
                .min(Comparator.comparingInt(p -> p.experiencia()))
                .ifPresent(p -> p.lenguajes().stream()
                        .forEach(l -> System.out.println(l.nombre())));

        // e)
        System.out.println("\ne) Proyectos donde trabaja Luis González:");
        proyectos.stream()
                .filter(p -> p.equipo().contains(luis))
                .forEach(p -> System.out.println(p.nombre()));

        // f)
        System.out.println("\nf) Programadores ordenados por experiencia:");
        programadores.stream()
                .sorted(Comparator.comparingInt(p -> p.experiencia()))
                .forEach(p -> System.out.println(p.nombre() + " - " + p.experiencia()));

        // g)
        System.out.println("\ng) Media de lenguajes conocidos:");
        double mediaLenguajes = programadores.stream()
                .mapToInt(p -> p.lenguajes().size())
                .average()
                .orElse(0);
        System.out.println(mediaLenguajes);

        // h)
        System.out.println("\nh) Proyectos con su programador principal:");
        proyectos.forEach(p ->
                System.out.println(p.nombre() + ": " + p.equipo().get(0).nombre()));

        // i)
        System.out.println("\ni) Proyecto con menos programadores:");
        proyectos.stream()
                .min(Comparator.comparingInt(p -> p.equipo().size()))
                .ifPresent(p -> System.out.println(p.nombre()));

        // j)
        System.out.println("\nj) Lenguajes multipropósito:");
        programadores.stream()
                .flatMap(p -> p.lenguajes().stream())
                .filter(l -> l.proposito() == Proposito.MULTIPROPOSITO)
                .map(l -> l.nombre())
                .distinct()
                .forEach(l -> System.out.println(l));

        // k)
        System.out.println("\nk) Media de experiencia en Banco Granada:");
        double mediaBanco = banco.equipo().stream()
                .mapToInt(p -> p.experiencia())
                .average()
                .orElse(0);
        System.out.println(mediaBanco);

        // l)
        System.out.println("\nl) Programadores en Banco Granada ordenados alfabéticamente:");
        banco.equipo().stream()
                .map(p -> p.nombre())
                .sorted()
                .forEach(p -> System.out.println(p));

        // m)
        System.out.println("\nm) Lenguajes en MercaRafa:");
        merca.equipo().stream()
                .flatMap(p -> p.lenguajes().stream())
                .map(n -> n.nombre())
                .distinct()
                .forEach(n -> System.out.println(n));

        // n)
        System.out.println("\nn) Lenguajes multipropósito:");
        programadores.stream()
                .flatMap(p -> p.lenguajes().stream())
                .filter(n -> n.proposito() == Proposito.MULTIPROPOSITO)
                .map(n -> n.nombre())
                .distinct()
                .forEach(n -> System.out.println(n));

        // o)
        System.out.println("\no) Programadores que saben Java:");
        programadores.stream()
                .filter(p -> p.lenguajes().stream()
                        .anyMatch(l -> l.nombre().equalsIgnoreCase("Java")))
                .forEach(p -> System.out.println(p.nombre() + " - " + p.experiencia()));

        // p)
        System.out.println("\np) Proyectos donde los sueldos totales superan 5000€:");
        proyectos.stream()
                .filter(p -> p.equipo().stream()
                        .mapToInt(prog -> prog.experiencia() * 900 + prog.lenguajes().size() * 100)
                        .sum() > 5000)
                .forEach(p -> System.out.println(p.nombre()));

        // q)
        System.out.println("\nq) Proyectos con al menos un programador que sepa un lenguaje WEB:");
        proyectos.stream()
                .filter(p -> p.equipo().stream()
                        .anyMatch(prog -> prog.lenguajes().stream()
                                .anyMatch(lang -> lang.proposito() == Proposito.WEB)))
                .forEach(p -> System.out.println(p.nombre()));

        // r)
        System.out.println("\nr) Programadores que participan en al menos dos proyectos:");
        programadores.stream()
                .filter(p -> proyectos.stream()
                        .filter(pr -> pr.equipo().contains(p))
                        .count() >= 2)
                .forEach(p -> System.out.println(p.nombre()));

        // s)
        System.out.println("\ns) Lenguajes usados por proyecto:");
        proyectos.forEach(p -> {
            String lenguajes = p.equipo().stream()
                    .flatMap(prog -> prog.lenguajes().stream())
                    .map(l -> l.nombre())
                    .distinct()
                    .collect(Collectors.joining(", "));
            System.out.println(p.nombre() + " > " + lenguajes);
        });
        
    }
}