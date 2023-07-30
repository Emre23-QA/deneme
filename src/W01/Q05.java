package W01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    /*Soru 33-)
Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
Örnek:
String str=''Kodlama harika.''
String arr[]: ".etaerg si gnidoC"
İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String metin= scanner.nextLine();


        String[] metinArr= metin.split("");
        String[] tersMetinArr= new String[metinArr.length];
        for (int i =metinArr.length-1 ; i >=0 ; i--) {
            tersMetinArr[i]=metinArr[metinArr.length-1-i];
        }
        System.out.println(Arrays.toString(tersMetinArr));
    }
}
