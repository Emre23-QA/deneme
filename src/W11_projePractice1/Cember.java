package W11_projePractice1;

public class Cember extends Sekil{
    //sekil <--Cember
    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public String toString() {
        return "YARIÇAP=" + yariCap + " ALAN=" + alanHesapla(yariCap) + " ÇEVRE=" + cevreHesaplama(yariCap);
    }
}
