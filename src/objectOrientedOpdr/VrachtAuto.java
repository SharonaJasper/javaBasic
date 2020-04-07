package objectOrientedOpdr;

public class VrachtAuto extends Auto {
    private int laadVermogen;

    public int getLaadVermogen(int i) {
        return laadVermogen;
    }

    public void setLaadVermogen(int laadVermogen) {
        this.laadVermogen = laadVermogen;
    }

    @Override
    public void rijden() {
        snelheid += 5;
    }

    @Override
    public void remmen() {
        snelheid -= 5;
    }

    public VrachtAuto(String merk, String kleur) {
        super(merk, kleur);
    }
}
