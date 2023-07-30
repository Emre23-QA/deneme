package W04_Arrays;

import java.util.Scanner;

public class Q06_birSayiyiTersYazma {

    public static void main(String[] args) {
         /*Soru-28)
Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
Örnek:
      Sayı: 1238
      Sayının Tersi: 8321
İpucu:  Loop kullanabilirsiniz.

          */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int intSayi= scanner.nextInt();

        String strSayi =""+intSayi;
        String sayiTersi="";
        for (int i = strSayi.length()-1; i >=0; i--) {
            char ch = strSayi.charAt(i);
            sayiTersi +=ch;

        }
        System.out.println("sayi: "+strSayi);
        System.out.println("sayinin tersi: "+sayiTersi);
    }
}
