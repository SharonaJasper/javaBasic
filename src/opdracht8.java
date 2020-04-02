import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class opdracht8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> threeNumbers = new ArrayList<>();
        int i = 0;
        while (i < 3) {
            i++;
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            threeNumbers.add(number);
        }

        System.out.println("The largest number is "+ Collections.max(threeNumbers));

    }
}
