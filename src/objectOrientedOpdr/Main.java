package objectOrientedOpdr;

public class Main {
    public static void main(String[] args) {
        Auto mijnAuto = new Auto("Tesla", "rood");

        mijnAuto.rijden();
        mijnAuto.remmen();
        System.out.println(mijnAuto.toString());

        Auto zijnAuto = new Auto("Suzuki", "grijs");

        for (int i = 0; i < 3; i++) {
            zijnAuto.rijden();
        }
        System.out.println(zijnAuto.toString());

        VrachtAuto truck1 = new VrachtAuto("Volvo", "blauw");
        truck1.setLaadVermogen(1000);

        RaceAuto mijnTweedeAuto = new RaceAuto("Ferrari", "rood");

        Voertuig mijnFiets = new Fiets("VanMook", "grijs");
        mijnFiets.rijden();



    }
}
