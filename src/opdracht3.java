import java.util.Scanner;

public class opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of the triangle: ");
        double firstSide = scanner.nextDouble();
        System.out.println("Enter second side of the triangle: ");
        double secondSide = scanner.nextDouble();
        double longSideSquare = firstSide*firstSide + secondSide*secondSide;
        double longSide = Math.sqrt(longSideSquare);
        System.out.println("The long side of the triangle is: " + longSide);
    }
}
