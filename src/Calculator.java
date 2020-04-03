
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JLabel display = new JLabel("");
    int firstNumber;
    int secondNumber;
    String operator = "";

    public Calculator() {
        String[] labels = { "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "+",
                "C", "0", "=", "-" };

        //create panel with gridlayout on content pane
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        getContentPane().add(panel, BorderLayout.CENTER);

        // give each button correct text, put in grid panel and connect to event
        for (int i = 0; i < 16; i++) {
            JButton button = new JButton(labels[i]);
            panel.add(button);
            button.addActionListener(this);
        }

        // create display with lay-out settings
        getContentPane().add(display, BorderLayout.NORTH);
        display.setPreferredSize(new Dimension(400, 30));
        display.setFont(new Font("Helvetica", Font.PLAIN, 22));

    }


    public static void main(String[] args) {
        // write your code here
        Calculator calculator = new Calculator();
        calculator.setSize(400, 400);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // performed action for each button
    @Override
    public void actionPerformed(ActionEvent e) {
        //new action command for button
        String currentButton = e.getActionCommand();
        //display.setText("");
        System.out.println("Clicked");

        switch (currentButton) {
            // number state
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                //merges multiple numbers to one string
                display.setText(display.getText() + currentButton);
                break;
            //operator state
            case "/": case "*": case "+": case "-":
                operator = currentButton;
                //converts string from display to integer
                firstNumber = Integer.parseInt(display.getText());
                display.setText("");
                break;
            //c button
            case "C":
                firstNumber = secondNumber = 0;
                display.setText("");
                break;
            //calculate state
            case "=":
                secondNumber = Integer.parseInt(display.getText());
                int result = 0;
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        break;
                }
                //result on display
                display.setText(result + "");
                break;
            default:
                // you should never come here
                System.out.println("System Error");

        }


    }
}
