package W11_projePractice12;

public class Sekil {
    /*
    1-asagidaki hiyarasiye gore classlar creat ediniz...

     sekil <--Cember
     sekil <--Dikdortgen<--Kare

    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik veriable'ler ekleyiniz.
    3- Runner class'da  Cember Dikdortgen Kare alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.

 */
    double yariCap;
    double uzunKenar;
    double kisaKenar;

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double alanHesaplama(double yariCap) {
        return  3.14 * yariCap * yariCap;
    }

    public double cevreHesaplama(double yariCap) {
        return  2 * 3.14 * yariCap;
    }

    public double alanHesaplama(double uzunKenar, double kisaKenar) {
        return (uzunKenar * kisaKenar);

    }

    public double cevreHesaplama(double uzunKenar, double kisaKenar) {
        return  (2 * (uzunKenar + kisaKenar));
    }
}
