package W06_arr_listArr;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_intArrayAynilariEleme {     //////// eksik!!!!
    /*Soru 37
SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
(Eliminate duplicates)
ENG:
Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
Write a test program that reads in ten integers, invokes the method, and displays the result.
(Tekrarlananları çıkar)
TÜR:
Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
On tane tamsayı alan ve o metodu çağırarak sonucu gösteren bir test programı yazınız.
---->>>
public static int[] eliminateDuplicates(int[] list)
ÖRNEK:
On sayi giriniz:
1 2 3 2 1 6 3 4 5 2
ÇIKTI:
Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ON elemanli bir int[] arrayin elemanlarini tek tek  input ediniz:");
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". elemani giriniz: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(eliminateDuplicates(arr)));
    }

    public static int[] eliminateDuplicates(int[] list) {
        int elemanSayisi = 10;
        int[] tekrarsizList;

        for (int i = 0; i < list.length - 1; i++) {       // tekrarsiz eleman sayisi bulma
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    elemanSayisi--;
                    break;
                }
            }
        }


        tekrarsizList = new int[elemanSayisi];
        boolean flag1 = true;   // 0 içerme durumu icin
        int sayac =0;    // tekrarsizlist indexi icin
        for (int i = 0; i < list.length-1; i++) {
            boolean flag2=true;
            for (int j = 0; j < tekrarsizList.length; j++) {
                if (list[i]==0&&flag1){
                    tekrarsizList[sayac]=list[i];
                        sayac++;
                        flag1=false;
                        flag2=false;
                        break;
                }
                else if (list[i] == tekrarsizList[j]) {
                    flag2=false;
                    break;
                }
            }
            if (flag2){
                tekrarsizList[sayac]=list[i];
                sayac++;
            }
           
        }
        return tekrarsizList;
    }
}
