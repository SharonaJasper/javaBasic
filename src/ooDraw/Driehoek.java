package ooDraw;

import java.awt.*;

public class Driehoek extends Figuur {
//    private int x33 = x2 - x1;
//    private int x32 = x33 / 2;
    private int x3 = 90;

    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y2, x2, y2);
        g.drawLine(x3, y1, x2, y2);
        g.drawLine(x1, y2, x3, y1);
    }
}
