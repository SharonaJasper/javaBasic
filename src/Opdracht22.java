import java.util.ArrayList;
import java.util.Arrays;

public class Opdracht22 {

    public static void main(String[] args) {
        boolean isPrime;
        int[] primeNumbers = new int[10];
        int i = 0;
        while (i < primeNumbers.length) {
            // j = 2, dividing by 0 or 1 is not a prime
            for (int j = 2; i < primeNumbers.length; j++) {
                isPrime = true;
                // check if not a prime
                for (int k = 2; k < j; k++) {
                    if (j % k == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    //add to array
                    primeNumbers[i] = j;
                    i++;
                }
            }
        }
        //print the array
        System.out.println(Arrays.toString(primeNumbers));
    }


}
