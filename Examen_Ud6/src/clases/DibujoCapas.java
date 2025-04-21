package clases;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class DibujoCapas implements Dibujable{
    private List<Dibujo> capas;
    private List<Boolean> visible;

    public DibujoCapas(int numCapas, int anchura,int altura){
        if (!(numCapas>=1)){
            throw new IllegalArgumentException("El minimo numero de capas es 1");
        }
        this.capas=new ArrayList<>();
        this.visible=new ArrayList<>();
        for (int i=0;i<numCapas;i++){
            this.capas.add(new Dibujo(anchura,altura));
            this.visible.add(true);
        }
    }

    public Dibujo nuevaCapa(){
        int anchura=this.capas.get(0).getBufferedImage().getWidth();
        int altura=this.capas.get(0).getBufferedImage().getHeight();
        Dibujo dibujo=new Dibujo(anchura,altura);
        this.visible.add(true);
        this.capas.add(dibujo);
        return dibujo;
    }

    public Dibujo getCapa(int numCapa){
        return this.capas.get(numCapa-1);
    }

    public void setCapa(int numCapa, Dibujo d){
        if (!((numCapa>=1&&numCapa<=this.capas.size())&&(d.getBufferedImage().getWidth()==this.capas.get(0).getBufferedImage().getWidth()&&d.getBufferedImage().getHeight()==this.capas.get(0).getBufferedImage().getHeight()))){
            throw new IllegalArgumentException("El numero de capa o el tamaño del dibujo son incorrectos");
        }
        this.capas.set(numCapa-1,d);
    }

    public void setVisible(int numCapa, boolean visible){
        this.visible.set(numCapa,visible);
    }

    @Override
    public BufferedImage getBufferedImage() {
        int anchura = this.capas.get(0).getBufferedImage().getWidth();
        int altura = this.capas.get(0).getBufferedImage().getHeight();
        BufferedImage bufferedImage = new BufferedImage(anchura, altura, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = bufferedImage.getGraphics();
        for (int i = 0; i < this.capas.size(); i++) {
            if (this.visible.get(i)) {
                graphics.drawImage(this.capas.get(i).getBufferedImage(), 0, 0, anchura, altura, null);
            }
        }
        return bufferedImage;
    }
}
