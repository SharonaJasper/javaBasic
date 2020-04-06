import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    JLabel display = new JLabel("Let's play TicTacToe!");
    JLabel winner = new JLabel("");
    JButton[] button = new JButton[9];
    int value;
    int i;
    String line;
    String board;


    public TicTacToe() {
        //create panel with gridlayout on content pane
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        getContentPane().add(panel, BorderLayout.CENTER);

        //add buttons
        for (i = 0; i < 9; i++) {
            button[i] = new JButton();
            panel.add(button[i]);
            button[i].addActionListener(this);
        }

        //labels with welcome text and winner
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(winner, BorderLayout.SOUTH);
        display.setPreferredSize(new Dimension(400, 30));
        display.setFont(new Font("Arial", Font.PLAIN, 22));
        winner.setPreferredSize(new Dimension(400, 30));
        winner.setFont(new Font("Arial", Font.PLAIN, 22));

    }

    public static void main(String[] args) {
        TicTacToe tc = new TicTacToe();
        tc.setSize(400, 400);
        tc.setVisible(true);
        tc.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();
        System.out.println("clicked");
        winner.setText("");

        value++;
        // set x or o string on button with single or double click
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == button[i]) {

                if (value % 2 == 1) {
                    button[i].setText("O");
                } else if (value % 2 == 0) {
                    button[i].setText("X");
                } else {
                    System.out.println("not recognized");
                }

                // determine if there's a winner
                for (int a = 0; a < 8; a++) {
                    line = null;
                    switch (a) {
                        //first row
                        case 0:
                            line = button[0].getText() + button[1].getText() + button[2].getText();
                            break;
                        //second row
                        case 1:
                            line = button[3].getText() + button[4].getText() + button[5].getText();
                            break;
                        //third row
                        case 2:
                            line = button[6].getText() + button[7].getText() + button[8].getText();
                            break;
                        //first column
                        case 3:
                            line = button[0].getText() + button[3].getText() + button[6].getText();
                            break;
                        //second column
                        case 4:
                            line = button[1].getText() + button[4].getText() + button[7].getText();
                            break;
                        //third column
                        case 5:
                            line = button[2].getText() + button[5].getText() + button[8].getText();
                            break;
                        //diagonal1
                        case 6:
                            line = button[0].getText() + button[4].getText() + button[8].getText();
                            break;
                        //diagonal2
                        case 7:
                            line = button[2].getText() + button[4].getText() + button[6].getText();
                            break;
                    }

                    // string of entire board
                    board = button[0].getText() + button[1].getText() + button[2].getText() +
                            button[3].getText() + button[4].getText() + button[5].getText() + button[6].getText() +
                            button[7].getText() + button[8].getText();

                    //System.out.println("board is " + board);

                    if (line.equals("XXX")) {
                        winner.setText("X wins!");
                        for (i = 0; i < 9; i++) {
                            button[i].setText("");
                        }
                    } else if (line.equals("OOO")) {
                        winner.setText("O wins!");
                        for (i = 0; i < 9; i++) {
                            button[i].setText("");
                        }
                    } else if (board.length() == 9) {
                        winner.setText("It's a draw! Thanks for playing.");
                        for (i = 0; i < 9; i++) {
                            button[i].setText("");
                        }
                    }

                    }



            }
        }
    }
}