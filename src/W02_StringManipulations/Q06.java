package W02_StringManipulations;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
yazdirin.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz : ");
        String str = scanner.nextLine();


        if (str.length()%2==0){
            System.out.println(str.substring(0,str.length()/2)+":)"+str.substring(str.length()/2));
        }
        else {
            int ortaIndex = (str.length()-1)/2;
            str = str.substring(0,ortaIndex)+":("+str.substring(ortaIndex+1);
            System.out.println(str);
        }

    }
}
