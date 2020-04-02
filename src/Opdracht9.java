import java.util.Scanner;

public class Opdracht9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        while (x < 100) {
            x++;
            System.out.println("enter a number between 1 - 10: ");
            int input = scanner.nextInt();
            if (input > 0 && input <= 10) {
                System.out.println("Number accepted");
            } else {
                System.out.println("Number not accepted. Choose between 1 -10.");
            }
        }

    }
}
