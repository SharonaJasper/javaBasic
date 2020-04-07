package objectOrientedOpdr;

public class Fiets implements Voertuig {
    private String merk;
    private String kleur;

    public Fiets(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    @Override
    public void rijden() {
        System.out.println("fiets rijdt");
    }

    @Override
    public void remmen() {
        System.out.println("fiets remt");
    }
}
