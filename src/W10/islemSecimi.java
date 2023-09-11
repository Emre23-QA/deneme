package W10;

import java.util.Scanner;

public class islemSecimi extends w10_islemDeposu{
    //public double kulla
    public void hesapMakinesi(double sayi1,double sayi2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tapacagınız islemi asagidaki sekilde seciniz.");
        System.out.println("Toplama icin '1' \n Cıkarma icin '2' \n Bolme icin '3' \n Carpma icin '4' \n e basiniz.");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                toplama(sayi1,sayi2);
                break;
            case 2:
                cikarma(sayi1,sayi2);
                break;
            case 3:
                bolme(sayi1,sayi2);
                break;
            case 4:
                carpma(sayi1,sayi2);
                break;
            default:
                System.out.println("Secim gecersiz!");
        }
    }

}
