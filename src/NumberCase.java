import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NumberCase extends JFrame implements ActionListener{

    JLabel display = new JLabel("Hello, enter your number in the text field above");
    JTextField inputTextF = new JTextField();

    // generate random number
    // define the range
    int max = 1000;
    int min = 1;
    int range = max - min + 1;
    int number = (int) (Math.random() * range) + min;


    public NumberCase() {

        JButton button = new JButton("Check number");
        getContentPane().add(button, BorderLayout.SOUTH);
        getContentPane().add(inputTextF, BorderLayout.NORTH);
        getContentPane().add(display, BorderLayout.CENTER);
        button.addActionListener(this);
        System.out.println(number);
    }

    public static void main(String[] args) {
        NumberCase nc = new NumberCase();
        nc.setSize(400, 400);
        nc.setVisible(true);
        nc.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // performed action for the button
    @Override
    public void actionPerformed(ActionEvent e) {
        //new action command for button
        String pushedButton = e.getActionCommand();
        System.out.println("clicked");

        pushedButton = inputTextF.getText();
        int userInput = Integer.parseInt(pushedButton);

        //clear display and text field
        //display.setText("");
        inputTextF.setText("");

        if(number > userInput) {
            display.setText("Aim a little higher");
        }
        else if(number == userInput) {
            display.setText("You guessed the number");
        }
        else {
            display.setText("Aim a little lower");
        }


    }


}
