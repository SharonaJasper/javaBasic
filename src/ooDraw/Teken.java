package ooDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Teken extends JFrame implements MouseListener, ActionListener {

    Figuur figuur;
    List<Figuur> figuren = new ArrayList<>();
    JButton button = new JButton("Save to file");
    private int apf;
    private String type;


    public static void main(String[] args) {
        Teken teken = new Teken();
        teken.setSize(400, 400);
        teken.setVisible(true);
        teken.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Teken() {

        //JMenuBar
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem JMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Figure");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //a group of JMenuItems
        JMenuItem rechthoek = new JMenuItem("Rechthoek");
        menu.add(rechthoek);
        rechthoek.addActionListener(this);

        JMenuItem ovaal = new JMenuItem("Ovaal");
        menu.add(ovaal);
        ovaal.addActionListener(this);

        JMenuItem lijn = new JMenuItem("Lijn");
        menu.add(lijn);
        lijn.addActionListener(this);

        JMenuItem driehoek = new JMenuItem("Driehoek");
        menu.add(driehoek);
        driehoek.addActionListener(this);


        //Build second menu in the menu bar.
        menu = new JMenu("Color");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        this.setJMenuBar(menuBar);


        getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
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
        if (apf == 0) {
            figuur = new Lijn();
        } else {
            if (type.equals("Rechthoek")) {
                figuur = new Rechthoek();
            } if (type.equals("Ovaal")) {
                figuur = new Ovaal();
            } if (type.equals("Lijn")) {
                figuur = new Lijn();
            } if (type.equals("Driehoek")) {
                figuur = new Driehoek();
            }
        }
        figuur.x1 = e.getX();
        figuur.y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
        figuur.x2 = e.getX();
        figuur.y2 = e.getY();
//        figuur = new Driehoek();
        repaint();
        figuren.add(figuur);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        apf = 1;
        String command = e.getActionCommand();
        System.out.println(command);
        System.out.println("actionperf");
        if (command.equals("Rechthoek")) {
            type = "Rechthoek";
            figuur = new Rechthoek();
            System.out.println(figuur);
        } if (command.equals("Ovaal")) {
            type = "Ovaal";
            figuur = new Ovaal();
            System.out.println(figuur);
        } if (command.equals("Lijn")) {
            type = "Lijn";
            figuur = new Lijn();
            System.out.println(figuur);
        } if (command.equals("Driehoek")) {
            figuur = new Driehoek();
            System.out.println(figuur);
            type = "Driehoek";
        } if (command.equals("Save to file")) {
            System.out.println("to file");
        }

        System.out.println(figuur);


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
