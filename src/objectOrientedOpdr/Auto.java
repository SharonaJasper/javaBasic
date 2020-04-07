package objectOrientedOpdr;

public class Auto implements Voertuig{
    private String merk;
    private String kleur;


    public Auto(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    protected int snelheid;

    @Override
    public String toString() {
        return "Auto{" +
                "snelheid=" + snelheid +
                '}';
    }

    @Override
    public void rijden() {
        snelheid += 10;
    }

    @Override
    public void remmen() {
        snelheid -= 10;
    }
}
