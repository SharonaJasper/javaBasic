import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hangman extends JFrame implements ActionListener {
    int i;
    int goodGuesses;
    int wrongGuesses;
    String currentWord = null;
    JLabel display = new JLabel("Let's play Hangman!");
    JLabel display2 = new JLabel("");
    JButton button = new JButton("Enter");
    JTextField inputTextF = new JTextField();
    String[] completeWord;
    String[] words = { "giraffe", "balcony", "pumpkin", "computer",
            "notebook", "drinks", "investigation", "java",
            "pollution", "trespasser", "volcano", "multiply",};

    public Hangman() {
        // generate random number for index word
        int max = words.length;
        int min = 0;
        int range = max - min;
        int number = (int) (Math.random() * range);
        System.out.println(number);
        //print current word
        currentWord = words[number];
        System.out.println(currentWord);

        //add displays
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(display2, BorderLayout.CENTER);
        display.setPreferredSize(new Dimension(400, 30));
        display.setFont(new Font("Helvetica", Font.PLAIN, 22));

        //add text field and button
        getContentPane().add(inputTextF, BorderLayout.SOUTH);
        getContentPane().add(button, BorderLayout.EAST);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        Hangman hm = new Hangman();
        hm.setSize(600, 400);
        hm.setVisible(true);
        hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        //read string from text field
        String userInput = inputTextF.getText();
        //check if valid
        if (userInput.equals("") || userInput.length() > 1) {
            display.setText("enter a single character");
            inputTextF.setText("");
        } else {
            if (currentWord.indexOf(userInput) == -1) {
                display.setText("character not in this word");
                inputTextF.setText("");
                wrongGuesses++;
                display2.setText("Number of good guesses: " + goodGuesses + "  " +
                        "Number of wrong guesses: " + wrongGuesses);

            } else {
                display.setText(userInput + " is at index " + currentWord.indexOf(userInput));
                //completeWord.();
                inputTextF.setText("");
                goodGuesses++;
                display2.setText("Number of good guesses: " + goodGuesses + "  " + "Number of wrong guesses: " + wrongGuesses);
            }
        }
        if (goodGuesses == currentWord.length()){
            display.setText("You guessed the word!");
        } else if (wrongGuesses == 10) {
            display.setText("You are out of turns");
        }



    }
}
