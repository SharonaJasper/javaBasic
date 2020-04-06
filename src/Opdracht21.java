import java.util.Scanner;

public class Opdracht21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer: ");
        int number = scanner.nextInt();
        System.out.println("The sum is " + getSum(number));
    }

    static int getSum(int n) {
        int sum = 0;
        //calculates sum
        while (n > 0) {
            sum += n % 10;
            n /= 10;
            System.out.println(n);
        }
            return sum;
    }

}
