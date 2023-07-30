package W02_StringManipulations;

import java.util.Scanner;

public class Q07_AyKacGun {
    public static void main(String[] args) {
        /*Bir aydaki gün sayısını bulmak için bir Java programı yazın.

        Bir ay numarası girin: 2
        Bir yıl girin: 2016
        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
                Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
                ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
                Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
                Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ay numarası girin:");  //ay numarası
        int ayNumarasi = scanner.nextInt();
        System.out.println("Bir yil girin:");          //yil numarası
        int yil = scanner.nextInt();

        switch (ayNumarasi) {
            case 1:
                System.out.println(ayNumarasi + ". ay 31 gun");
                break;
            case 2:
                artikYil(yil);
                break;
            case 3:
                System.out.println(ayNumarasi + ". ay 31 gun");
                break;
            case 4:
                System.out.println(ayNumarasi + ". ay 30 gun");
                break;
            case 5:
                System.out.println(ayNumarasi + ". ay 31 gun");
                break;
            case 6:
                System.out.println(ayNumarasi + ". ay 30 gun");
                break;
            case 7:
                System.out.println(ayNumarasi + ". ay 31 gun");
                break;
            case 8:
                System.out.println(ayNumarasi + ". ay 31 gun");
                break;
            case 9:
                System.out.println(ayNumarasi + ". ay 30 gun");
                break;
            case 10:
                System.out.println(ayNumarasi + ". ay 31 gun");
                break;
            case 11:
                System.out.println(ayNumarasi + ". ay 30 gun");
                break;
            case 12:
                System.out.println(ayNumarasi + ". ay 31 gun");
                break;
            default:
                System.out.println("gecersiz ay numarasi girildi!");
                break;
        }


    }
    public static void artikYil (int yil){
        if (yil % 100 != 0 && yil % 4 == 0 || yil % 100 == 0 && yil % 400 == 0) {
            System.out.println("2. ay 29 gun");
        } else {
            System.out.println("2. ay 28 gun");
        }
    }
}
