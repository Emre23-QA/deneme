package W10;

import java.util.Scanner;

public class w10_islemDeposu implements hesapMakinesiMethodlar {
    double sayi1 = 0;
    double sayi2 = 0;

    @Override
    public double toplama(double sayi1, double sayi2) {
        double sonuc = sayi1 + sayi1;
        return sonuc;
    }

    @Override
    public double cikarma(double sayi1, double sayi2) {
        double sonuc = sayi1 - sayi2;
        return sonuc;
    }

    @Override
    public double bolme(double sayi1, double sayi2) {
        try {
            double sonuc = sayi1 / sayi2;
            return sonuc;
        } catch (ArithmeticException e) {
            System.out.println("sayi2 0 olamaz!");
            return 0;
        }

    }

    @Override
    public double carpma(double sayi1, double sayi2) {
        double sonuc = sayi1 * sayi2;
        return sonuc;
    }


}
