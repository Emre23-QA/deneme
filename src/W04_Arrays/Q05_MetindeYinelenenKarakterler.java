package W04_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_MetindeYinelenenKarakterler {
    public static void main(String[] args) {
        /*Soru 30-)
Bir Stringdeki yinelenen harfleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scanner.nextLine();
        String metinYazilar = metin;
        metinYazilar = metinYazilar.replaceAll("\\d", "")
        .replaceAll("\\W", "")
        .replace("_", "");

        String strTekrarlanan = "";

        for (int i = 0; i < metinYazilar.length(); i++) {

            for (int j = i + 1; j < metinYazilar.length(); j++) {
                char harf1 = metinYazilar.charAt(i);
                char harf2 = metinYazilar.charAt(j);
                if (harf1 == harf2) {

                    strTekrarlanan += harf1;
                }

            }

        }
        String[] arrTekrarlanan = strTekrarlanan.split("");
        System.out.println(Arrays.toString(arrTekrarlanan));
    }
}
