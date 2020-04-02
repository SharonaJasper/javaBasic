import java.util.Scanner;

public class Opdracht19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        char c = 'a';
        System.out.println("The number of occurrences of the letter a is: " + count(word, c));
    }

    public static int count(String s, char c)
    {
        int res = 0;
        for (int i=0; i<s.length(); i++)
        {
            //check if char is "a"
            if (s.charAt(i) == c)
                res++;
        }
        return res;
    }
}
