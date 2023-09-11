package W11_projePractice12;

public class Cember extends Sekil{

    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public String toString() {
        return "YARIÇAP=" + yariCap + " ALAN=" + alanHesaplama(yariCap) + " ÇEVRE=" + cevreHesaplama(yariCap);
    }
}
