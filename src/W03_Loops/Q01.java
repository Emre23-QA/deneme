package W03_Loops;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan
                  yeni bir String oluşturun ve konsolda yazdırın
                  Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.

                  Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                               Loopun içerisinde StringM methodlarından  yararlanalım!

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("en az 5 harfli bir kelime girin : ");
        String kelime= scanner.next();

        while (kelime.length()<5)
        {
            System.out.println("en az 5 harfli yeni bir kelime girin : ");
            kelime=scanner.next();
        }

        String kelimeYeni=kelime.substring(kelime.length()-3)+kelime.substring(kelime.length()-3);
        System.out.println(kelimeYeni);

    }
}
