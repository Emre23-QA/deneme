package W01;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    /*MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
    Mountain array ==> [0,2,5,3,1]
    Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
    Mountain array değildir ==>[5,2,7,1,4]

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("arr uzunlugunu giriniz: ");
        int arrUzunluk = scanner.nextInt();
        int[] arr = new int[arrUzunluk];
        int enBuyuk;
        int sayi1;
        int sayi2;

        for (int i = 0; i < arrUzunluk; i++) {                                  // arr olusturma.
            System.out.println("array'in " + i + ". index elementini giriniz: ");
            arr[i] = scanner.nextInt();
        }

        enBuyuk = arr[0];                                                       // en buyuk element.
        for (int each : arr
        ) {
            if (each > enBuyuk) {
                enBuyuk = each;
            }
        }

        boolean flag1 = true;
        boolean flag2 = false;                                                   // Mauntain kontrol.
        for (int i = 0; i < arrUzunluk - 1; i++) { //--> enbuyuk'e kadar artis enbuyukten sonra azalis kontrol edilecek:

            if (arr[i] != enBuyuk && flag1) {      //1) enbuyuk'e gelene kadar flg1 treu if calısır
                if (arr[i] >= arr[i + 1]) {
                    flag2 = true;
                }
            } else {                               // 2)enbuyuk'e geldikten sonra flg1 false olur ve artık else teki durum çalşır
                flag1 = false;
                if (arr[i] <= arr[i + 1]) {
                    flag2 = true;
                }
            }
        }

        if (flag2) {                                                             // yazdirma.
            System.out.println("Mountain array değildir ==> " + Arrays.toString(arr));
        } else {
            System.out.println("Mountain array ==> " + Arrays.toString(arr));
        }

    }
}
