package ooDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Teken extends JFrame implements MouseListener {

    Figuur figuur = new Ovaal();
    List<Figuur> figuren = new ArrayList<>();


    public static void main(String[] args) {
        Teken teken = new Teken();
        teken.setSize(400, 400);
        teken.setVisible(true);
        teken.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Teken() {
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figuur f : figuren) {
            f.draw(g);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
        figuur = new Ovaal();
        figuur.x1 = e.getX();
        figuur.y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
        figuur.x2 = e.getX();
        figuur.y2 = e.getY();
        repaint();
        figuren.add(figuur);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
