package W06_arr_listArr;

import java.util.Arrays;

public class Q05_IkiArrayBirlestirme {
    /*Soru 40-)
Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
                int[] arr2={5,6};

                arrBirlestir(arr1,arr2);
    }
    public static void arrBirlestir(int[] arr1,int[] arr2){

        int[] birleskArr= new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            birleskArr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            birleskArr[i+arr1.length]=arr2[i];
        }
        System.out.println("birlesik array : " + Arrays.toString(birleskArr));
    }
}
