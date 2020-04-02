import java.util.*;

public class opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter article: ");
        String article = scanner.nextLine();
        System.out.println("Enter noun: ");
        String noun = scanner.nextLine();
        System.out.println("Enter verb: ");
        String verb = scanner.nextLine();
        System.out.println("You chose: " + article + ", " + noun + ", " + verb);
    }
}
