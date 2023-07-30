package W04_Arrays;

import java.util.Scanner;

public class Q02_StringdekiRakamlarToplami {
    public static void main(String[] args) {
        /*Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

Örnek
String str : ade1r4d3
Int toplam : 8
İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        stringdekiRakamlarToplami(metin);
    }

    public static void stringdekiRakamlarToplami(String metin) {

        int metinSize=metin.length();
        Character carakter = ' ';
        int toplam=0;

        for (int i = 0; i < metinSize; i++) {
            carakter=metin.charAt(i);

            if (Character.isDigit(carakter))
            {
                toplam+=Character.getNumericValue(carakter);

            }
        }

        System.out.println(toplam);
    }
}
