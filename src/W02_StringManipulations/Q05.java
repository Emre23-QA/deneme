package W02_StringManipulations;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz : ");
        String isim = scanner.nextLine();

        System.out.println("lutfen soyisminizi giriniz : ");
        String soyIsim = scanner.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.print(isim.toLowerCase().replaceFirst(isim.substring(0,1), isim.toUpperCase().substring(0,1))+" ");
            System.out.println(soyIsim.replaceFirst(soyIsim.substring(0, 1), soyIsim.toUpperCase().substring(0, 1)));
        }
        if (isim.length()<soyIsim.length()) {
            System.out.print(isim.replaceFirst(isim.substring(0,1), isim.toUpperCase().substring(0,1))+" ");
            System.out.println(soyIsim.toUpperCase());
        }

    }
}
