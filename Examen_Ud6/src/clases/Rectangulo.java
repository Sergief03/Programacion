package clases;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Rectangulo extends ElementoDibujoColoreable{
    public Rectangulo(Point cor, int b,int a, Color col, int p) {
        super(cor, new Dimension(b,a), col, p);
    }

    @Override
    protected void dibujar(Graphics g) {
        g.fillRect(this.getX(),this.getY(),this.getAnchura(),this.getAltura());
    }

    @Override
    public BufferedImage getBufferedImage() {
        BufferedImage bufferedImage=new BufferedImage(this.getAltura(),this.getAnchura(),BufferedImage.TYPE_INT_ARGB);
        Graphics graphics= bufferedImage.getGraphics();
        this.dibujar(graphics);
        return bufferedImage;
    }
}
