package W06_arr_listArr;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_sort_ArrMaxMin {
    /*Soru-38)
Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
Ipucu: sort yöntemni kullanabilirsiniz.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen arrayin eleman sayisini girin:  ");
        int elemanSayisi= scanner.nextInt();
        int[] arr = new int[elemanSayisi];

        for (int i = 0; i <elemanSayisi ; i++) {
            System.out.println((i + 1) + ". elemani giriniz: ");
            arr[i]=scanner.nextInt();

        }
        arrMaxMinBulma(arr);
    }
    public static void arrMaxMinBulma(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];

        System.out.println("max deger : " + max);
        System.out.println("min deger : " + min);
    }
}
