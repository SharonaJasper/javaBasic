package objectOrientedOpdr;

public class RaceAuto extends Auto {
    private int topSnelheid;

    public int getTopSnelheid() {
        return topSnelheid;
    }

    public void setTopSnelheid(int topSnelheid) {
        this.topSnelheid = topSnelheid;
    }

    public RaceAuto(String merk, String kleur) {
        super(merk, kleur);
    }
}
