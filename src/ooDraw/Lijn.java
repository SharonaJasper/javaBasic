package ooDraw;

import java.awt.*;

public class Lijn extends Figuur {

    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);

    }
}
