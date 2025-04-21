package clases;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagenEscalable extends ElementoDibujoConfinado{
    private BufferedImage imagen;

    public ImagenEscalable(String ruta, int x,int y,int ancho,int alto, int p) throws IOException {
        this(ruta,new Point(x,y),new Dimension(ancho,alto),p);
    }

    public ImagenEscalable(String ruta, Point c, Dimension t, int p) throws IOException{
        super(c,t,p);
        try {
            this.imagen= ImageIO.read(new File(ruta));
        }catch (IOException e){
            throw new IOException("La imagen no se ha cargado correctamente");
        }
    }

    @Override
    protected void dibujar(Graphics g) {
        g.drawImage(this.imagen,this.getX(),this.getY(),null);
    }

    @Override
    public BufferedImage getBufferedImage() {
        BufferedImage bufferedImage=new BufferedImage(this.getAltura(),this.getAnchura(),BufferedImage.TYPE_INT_ARGB);
        Graphics graphics= bufferedImage.getGraphics();
        this.dibujar(graphics);
        return bufferedImage;
    }
}
