package W02_StringManipulations;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
basariyla kaydedildi" yazdirin
- ilk harf kucuk harf olmali
- son karakter rakam olmali
- sifre bosluk icermemeli
- uzunlugu en az 10 karakter olmali

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz : ");
        String str = scanner.nextLine();

        int i=0;
        String ilkHarf = str.replaceAll("\\W","").replaceAll("\\d","").replace("_","");
        if (ilkHarf.charAt(0) >'z' || ilkHarf.charAt(0)<'a'){
            i++;
            System.out.println("ilk harf kucuk harf olmali");
        }

        if (str.substring(str.length()-1)
                .replaceAll("\\D","true")
                .equals("true")) {
            i++;
            System.out.println("son karakter rakam olmali");
        }
        if (str.contains(" ")==true ) {
            i++;
            System.out.println("sifre bosluk icermemeli");
        }
        if (str.length()<10){
            i++;
            System.out.println("uzunlugu en az 10 karakter olmali");

        }

        if (i==0) System.out.println("sifre basariyla kaydedildi");

    }
}
