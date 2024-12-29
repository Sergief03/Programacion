public class Ejerjcicio5 {
    public static void main(String[] args) {
        int mesa=120;
        int pixelesMesa=1040;
        double pixel=(double) pixelesMesa/mesa;
        int anchoMueble=140;
        int altoMueble=80;

        System.out.println("El espejo tendra unas dimensiones de "+((int)(anchoMueble*pixel))+"x"+((int)(altoMueble+pixel))+" pixeles");

    }
}
