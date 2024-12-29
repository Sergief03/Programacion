import bpc.daw.musica.*;


public class Ejercicio31 {
    public static void main(String[] args) {
        final int DO=0;
        final int RE=1;
        final int MI=2;
        final int FA=3;
        final int SOL=4;
        final int LA=5;
        final int SI=6;

        final int REDONDA=0;
        final int BLANCA=1;
        final int NEGRA=2;
        final int CORCHEA=3;
        final int SEMICORCHEA=4;

        NotaMusical notaDo=new NotaMusical(DO,NEGRA);
        NotaMusical notaSol=new NotaMusical(SOL,NEGRA);
        NotaMusical notaLa=new NotaMusical(LA,NEGRA);
        NotaMusical notaSolBlanca=new NotaMusical(SOL,BLANCA);
        NotaMusical notaFaCorchea=new NotaMusical(FA,CORCHEA);
        NotaMusical notaMiCorchea=new NotaMusical(MI,CORCHEA);
        NotaMusical notaReSemiCorchea=new NotaMusical(RE,SEMICORCHEA);
        NotaMusical notaMiSemiCorchea=new NotaMusical(MI,SEMICORCHEA);
        NotaMusical notaFaSemiCorchea=new NotaMusical(FA,SEMICORCHEA);

        Cancion cancion=new Cancion("Cancion");
//do,do,sol,sol,la,la,sol(blanca),(fa,fa,mi,mi)(corchea),(re,mi,fa,re)(semi),do
        cancion.añadir(notaDo);
        cancion.añadir(notaDo);
        cancion.añadir(notaSol);
        cancion.añadir(notaSol);
        cancion.añadir(notaLa);
        cancion.añadir(notaLa);
        cancion.añadir(notaSolBlanca);
        cancion.añadir(notaFaCorchea);
        cancion.añadir(notaFaCorchea);
        cancion.añadir(notaMiCorchea);
        cancion.añadir(notaMiCorchea);
        cancion.añadir(notaReSemiCorchea);
        cancion.añadir(notaMiSemiCorchea);
        cancion.añadir(notaFaSemiCorchea);
        cancion.añadir(notaReSemiCorchea);
        cancion.añadir(notaDo);

        Instrumento piano= new Piano();

        piano.reproducir(cancion);
        Instrumento guitarra=new Guitarra();
        guitarra.reproducir(cancion);


    }
}
