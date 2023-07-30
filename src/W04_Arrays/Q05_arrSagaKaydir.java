package W04_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_arrSagaKaydir {
    /*// Soru -  Verilen bir array deki tüm elementleri bir saga kaydirip,
        //         sondaki elementi de basa tasiyacak bir method olusturun, array i yeni haliyle kaydedin.

     */
    public static void main(String[] args) {
        int[] arr = {13, 20, 50, 43};
        System.out.println(Arrays.toString(arr));

        arrSagaKaydirma(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrSagaKaydirma(int[] arr) {

        int elemanSayisi = arr.length;
        int sonEleman=arr[elemanSayisi-1];


        for (int i = elemanSayisi-1; i >=0; i--) {
            if (i!=0)
            {
                arr[i]=arr[i-1];
            }
            else arr[0]=sonEleman;

        }



    }


}
