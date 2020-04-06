import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> tests = new ArrayList<>();
        int i = 0;
        while (i < 5) {
          System.out.println("Enter test score: ");
          int test1 = scanner.nextInt();
          i++;
          if (test1 >= 7) {
            tests.add(test1);
          }

        }

        System.out.println("Number of scores >= 7: " + tests.size());
        for (Integer test : tests) {
            System.out.println(test);
        }


    }
}
