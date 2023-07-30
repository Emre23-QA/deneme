package W05_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*// Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //         bize ilk n tane tane Fibonacci sayisini bir list olarak donduren
        //         bir method olusturun.
        //    Fibonacci serisi : 0 1 1 2 3 5 8 13 21 34 55 89 144 233
        day25_Q04
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kacinci sıradaki Fibonacci sayisini istediginizi giriniz: ");
        int sira = scanner.nextInt();

        System.out.println(sira + ". siraya kadar Fibonacci List: " + fibonacciList(sira));
    }

    public static List<Integer> fibonacciList(int sira) {
        List<Integer> list = new ArrayList<>();
        if (sira <= 0) {

            System.out.println("gecersiz sira no girildi.");
        } else if (sira == 1) {
            list.add(0);

        } else {
            int sayi1 = 0;
            int sayi2 = 1;
            int sayac = 2;
            int temp = sayi1 + sayi2;

            list.add(sayi1);
            list.add(sayi2);

            while (sayac < sira) {
                list.add(temp);
                sayi1 = sayi2;
                sayi2 = temp;
                temp = sayi1 + sayi2;
                sayac++;
            }
        }

        return list;
    }
}
