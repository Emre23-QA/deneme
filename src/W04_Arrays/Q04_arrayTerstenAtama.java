package W04_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_arrayTerstenAtama {
    public static void main(String[] args) {

        /*Soru 32-)
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
                İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen array uzunlugunu giriniz");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int[] arrReverse=new int[arrSize];

        for (int i = 0; i < arrSize ; i++) {
            System.out.println("lutfen int bir deger girin:");
            arr[i]= scanner.nextInt();
        }

        for (int i = 0; i < arrSize; i++) {
            arrReverse[i]=arr[arrSize-1-i];
        }

        System.out.println(Arrays.toString(arrReverse));

    }
}
