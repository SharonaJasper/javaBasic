package ooDraw;

import java.awt.*;

public class Ovaal extends Figuur {

    @Override
    public void draw(Graphics g) {
        g.drawOval(x1, y1, x2-x1, y2-y1);
    }


}
