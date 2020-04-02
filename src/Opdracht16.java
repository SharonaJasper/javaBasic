import java.util.ArrayList;

public class Opdracht16 {
    public static void main(String[] args) {
        ArrayList<Integer> reeks = new ArrayList<>();

        int i;
        int s = 5;
        for (i = 0; i < 10; i++) {
            System.out.println(s);
            reeks.add(s);
            s = s + 4;
        }
        System.out.println(reeks);

    }
}
