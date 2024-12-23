package Simulacro2;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Simulacro2 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        consola.getCapaCanvas();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics graphics=capaCanvas.getGraphics();
        graphics.setColor(Color.white);

        graphics.drawLine(250,46,196,180);
        graphics.drawLine(196,180,446,224);
        graphics.drawLine(446,224,297,268);
        graphics.drawLine(297,268,250,400);
        graphics.drawLine(250,400,203,268);
        graphics.drawLine(203,268,53,224);
        graphics.drawLine(53,224,202,180);
        graphics.drawLine(202,180,250,46);

        try {
            Robot robot= new Robot();
            Rectangle rectangle=new Rectangle(2000,2000);
            robot.createScreenCapture(rectangle);
            BufferedImage image=robot.createScreenCapture(rectangle);
            File file=new File("estrella.png");
            ImageIO.write(image,"png",file);
        } catch (AWTException e) {
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
