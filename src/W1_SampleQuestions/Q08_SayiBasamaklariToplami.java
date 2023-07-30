package W1_SampleQuestions;

import java.util.Scanner;

public class Q08_SayiBasamaklariToplami {
    public static void main(String[] args) {
        /*Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
ipuclari:
Matematiksel Islemler konusuna bakalim.
Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir tam sayi giriniz : ");
        int basamak=0,basamakToplam=0;
        int sayi = scanner.nextInt();
        for (int i=0;i<3;i++){
            basamak = sayi%10;
           sayi /= 10;
            basamakToplam += basamak;
        }
        System.out.println("Sayinin basamaklar toplami : " + basamakToplam);
    }
}
