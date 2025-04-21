package clases;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class ElementoDibujoGirado extends ElementoDibujo{
    private ElementoDibujo elemento;
    private double angulo;

    public ElementoDibujoGirado(ElementoDibujo e, double a) {
        super(new Point(e.getX(),e.getY()), e.getProfundidad());
        if (e instanceof ElementoDibujoGirado ele){
            throw  new IllegalArgumentException("El elemento no puede ser un elemento girado");
        }
        this.elemento=e;
        this.angulo=a;
    }

    @Override
    protected void dibujar(Graphics g) {
        BufferedImage imagen=this.elemento.getBufferedImage();
        AffineTransformOp filtro=new AffineTransformOp(AffineTransform.getRotateInstance(Math.toRadians(this.angulo)),AffineTransformOp.TYPE_BICUBIC);
        BufferedImage imagenRotada=filtro.filter(imagen,null);
        g.drawImage(imagenRotada,this.elemento.getX(),this.elemento.getY(),null);
    }

    @Override
    public int getAltura() {
        return this.elemento.getAltura();
    }

    @Override
    public int getAnchura() {
        return this.elemento.getAnchura();
    }

    @Override
    public BufferedImage getBufferedImage() {
        BufferedImage bufferedImage=new BufferedImage(this.getAltura(),this.getAnchura(),BufferedImage.TYPE_INT_ARGB);
        Graphics graphics= bufferedImage.getGraphics();
        this.dibujar(graphics);
        return bufferedImage;
    }
}
