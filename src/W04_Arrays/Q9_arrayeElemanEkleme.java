package W04_Arrays;

import java.util.Arrays;

public class Q9_arrayeElemanEkleme {
    /*// verilen bir array'in uzunlugunu bir artirarak
        // verilen bir element'i ekleyin
        int[] arr = {3,7,8};
        int eklenecekSayi = 10;
     */
    public static void main(String[] args) {
        int[] arr = {3,7,8};
        int eklenecekSayi = 1;

        System.out.println(Arrays.toString(arr));
        arr=arrayAdd(arr,eklenecekSayi);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 1));//3 yerine-1 döndü cunku sort edilmedi

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 1)); // sort edildiginde 1 in indexi 0 oldu
        System.out.println(Arrays.toString(arr));


    }
    public static int[] arrayAdd(int[] arr,int eklenecekEleman)
    {
        int arrUzunluk=arr.length;
        int[] yeniArr = new int[arrUzunluk+1];
        for (int i = 0; i < arrUzunluk; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[arrUzunluk]=eklenecekEleman;
        return yeniArr;
    }
}
