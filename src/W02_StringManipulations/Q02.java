package W02_StringManipulations;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
           input1 : “15.30 €” , input2 : “11.40 €”
           output : 26.70 €

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen “11.40 €” seklinde ilk fiyati giriniz : ");
        String fiyat1 = scanner.nextLine();
        System.out.println("lutfen “11.40 €” seklinde ikinci fiyati giriniz : ");
        String fiyat2 = scanner.nextLine();

        // fiyati duzenle
        fiyat1=fiyat1.replace("€","").replace(".","_")
                .replaceAll("\\W","").replace("_",".").trim();
        fiyat2=fiyat2.replace("€","").replace(".","_")
                .replaceAll("\\W","").replace("_",".").trim();
        System.out.println(fiyat1+fiyat2);

        // String double yap

        Double dblFiyat1 = Double.parseDouble(fiyat1);
        Double dblFiyat2 = Double.parseDouble(fiyat2);

        System.out.println("Toplam Fiyat: ");
       System.out.println(dblFiyat1+dblFiyat2+" €");

    }
}
