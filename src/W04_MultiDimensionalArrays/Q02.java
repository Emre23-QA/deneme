package W04_MultiDimensionalArrays;

import java.util.Arrays;

public class Q02 {
    /*Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
olusturacagimiz tek katli bir array’e bu toplamlari atayin.
input : int[][] arr = {{3,4,5}, {2,3,6,7}};
output: [5, 7, 11]

     */
    public static void main(String[] args) {
        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
        int uzunluk = arr[0].length >= arr[1].length ? arr[1].length : arr[0].length;
        int[] tolam= new int[uzunluk];


        for (int i = 0; i < uzunluk; i++) {
            for (int j = 0; j <2 ; j++) {
                tolam[i] += arr[j][i];
            }
        }
        System.out.println(Arrays.toString(tolam));

    }
}
