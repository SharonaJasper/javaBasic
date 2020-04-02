import java.util.Scanner;

public class opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degrees in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenh = 1.8 * celsius + 32;
        System.out.println("This is " + fahrenh +" degrees Fahrenheit");
    }
}
