import java.util.Scanner;

public class Opdracht11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total =0;

        while (true) {
            System.out.print("press 10 to exit. ");
            System.out.print("Enter product number: ");

            int prodNr = scanner.nextInt();
            if (prodNr == 10) {
                break;
            }

            System.out.print("Enter quantity sold: ");
            int quantitySold = scanner.nextInt();


            switch (prodNr) {
                case 1:
                    total = total + quantitySold * 2.95;
                    break;
                case 2:
                    total = total + quantitySold * 4.99;
                    break;
                case 3:
                    total = total + quantitySold * 5.49;
                    break;
                case 4:
                    total = total + quantitySold * 7.80;
                    break;
                case 5:
                    total = total + quantitySold * 8.85;
                    break;
            }


            System.out.println("\nThe total retail value of sold products: $" + total);
        }

    }
}
