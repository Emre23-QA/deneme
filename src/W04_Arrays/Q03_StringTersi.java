package W04_Arrays;

import java.util.Scanner;

public class Q03_StringTersi {

    public static void main(String[] args) {

        /*Soru 33-)
Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen tersine cevrilecek metni girin: ");
        String metin = scanner.nextLine();

        String[] arr = metin.split("");

        int metinSize = metin.length();

        for (int i = metinSize-1; i >=0; i--) {
            System.out.print(arr[i]);
        }

    }
}
