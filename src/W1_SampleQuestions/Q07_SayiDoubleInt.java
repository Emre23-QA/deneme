package W1_SampleQuestions;

import java.util.Scanner;

public class Q07_SayiDoubleInt {
    public static void main(String[] args) {
        /*Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
ipuclari:
( Data Casting -> Auto Widening ve Explicit Narrowing )

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen double bir sayi giriniz : ");
        double sayi = scanner.nextDouble();
        System.out.println("tam sayi hali : "+(int) sayi);
        System.out.println("Lutfen float bir sayi giriniz : ");
        float sayi1 = scanner.nextFloat();
        System.out.println("tam sayi hali : "+(short) sayi1);
    }
}
