package clases;

import java.awt.*;
import java.util.Collections;

public abstract class ElementoDibujoColoreable extends ElementoDibujoConfinado{
    private Color color;

    public ElementoDibujoColoreable(Point cor, Dimension t,Color col, int p) {
        super(cor, t, p);
        this.color=col;
    }

    public Color getColor(){
        return this.color;
    }
}
