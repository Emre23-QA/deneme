package W04_Arrays;

import java.util.Arrays;

public class Q10_MultiDimArr {
    /*Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
olusturacagimiz tek katli bir array’e bu toplamlari atayin.
input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
output: [10, 3, 12, 10, 9
     */
    public static void main(String[] args) {
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        innerToplama(arr);

    }
    public static void innerToplama(int[][]arr)
    {
        int innerSayisi= arr.length;
        int[] innerToplam = new int[innerSayisi];

        for (int i = 0; i <innerSayisi ; i++) {
            int toplam=0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
            innerToplam[i]=toplam;
        }
        System.out.println(Arrays.toString(innerToplam));
    }
}
