public class Opdracht15 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1; i < 20; i = i + 2) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
