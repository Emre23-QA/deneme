package W01;

import java.util.Scanner;

public class Q04 {
    /*Soru 34-)
Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

Örnek
String str : ade1r4d3
Int toplam : 8
İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String metin=scanner.nextLine();
        toplam(metin);
    }
    public static void toplam(String str)
    {
        int toplam= 0;
        for (int j = 0; j < str.length(); j++) {



            if (Character.isDigit(str.charAt(j))){
               toplam+=Integer.valueOf(str.substring(j,j+1));
            }

        }
        System.out.println("toplam : "+toplam);
    }
}
