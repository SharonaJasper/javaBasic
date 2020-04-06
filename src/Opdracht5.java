import java.util.Scanner;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("value of x: ");
        int x = scanner.nextInt();
        System.out.println("value of y: ");
        int y = scanner.nextInt();

        if (x / y == 5) {
            x = 100;
        }
        if (x * y == 5) {
            x = 1;
        }
        if (x < y) {
            x = x * 2;
        }
        if (x > y) {
            x++;
        }

        System.out.println(x);
        System.out.println(y);

    }
}
