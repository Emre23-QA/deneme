package W02_StringManipulations;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
input : java1 ogRe2@nMek3 #ne +Gu=zel
output : Java ogrenmek ne guzel.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz : ");
        String str = scanner.nextLine();
        str = str.replaceAll("\\d","")// sayilari cikar
                .replaceAll(" ","1")   // bosluklari 1 yap
                .replaceAll("\\W","") // metin ve sayi olmayanlari  cikar
                .replaceAll("1"," ")  // 1 leri bosluk yap
                .replace("_","")     // "_"  i cikar
                .toLowerCase();                      // hepsini kucuk harf yap

        str = str.replace(str.substring(0,1),str.substring(0,1).toUpperCase()); // ilk harfi büyük yap
        System.out.println(str);
    }
}
