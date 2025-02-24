package tema5.ejercicio32;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Bombo {
    private Queue<Bola> bolas;

    public Bombo(int totalBolas){
        Random random=new Random();

        this.bolas=new ArrayDeque<>();
        for (int i=0;i<totalBolas;i++){
            bolas.add(new Bola(random.nextInt(100)));
        }
    }

    public int getNumeroBolas(){
        return this.bolas.size();
    }

    public Bola sacarBola(){
        return this.bolas.poll();
    }
}
