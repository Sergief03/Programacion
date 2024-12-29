public class Ejercicio40 {
    public static void main(String[] args) {
        System.out.println("El ordenador posee "+Runtime.getRuntime().availableProcessors()+" procesadores\nY una RAM asociada a java de "+(Runtime.getRuntime().totalMemory()/(1024*1024))+" MB");
    }
}
