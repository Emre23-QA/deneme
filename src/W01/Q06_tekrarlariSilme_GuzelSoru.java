package W01;

import java.util.Arrays;

public class Q06_tekrarlariSilme_GuzelSoru {
    /*Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
     */
    public static void main(String[] args) {
        int[] arr = {1,2,52,36,1,42,52,9,2,685};
        int[] yeniArr;
        int elemanSayisi= arr.length;

        // yeniArr eleman sayisi bulma
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    elemanSayisi--;
                    break;
                }

            }
        }

        // yeniArr eleman ekleme
        yeniArr=new int[elemanSayisi];
        boolean flag = true;
        int sayac=0;       //*//
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < yeniArr.length; j++) {
                if (arr[i]==yeniArr[j]){
                    flag=false;
                    break; //*//
                }
            }
            if (flag){
                yeniArr[sayac]=arr[i];
                sayac++;   //*//
            }
            flag=true;
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
