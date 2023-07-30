package W05_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*// Soru 6-
        //         verilen pozitif bir  tamsayiyi
        //         tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.

         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("bir sayi girin: ");
        int sayi = scanner.nextInt();
        System.out.println(pozitifTamBolenlerListesi(sayi));
    }

    public static List<Integer> pozitifTamBolenlerListesi(int sayi) {
        List<Integer> pozitifTamBolenlerList = new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                pozitifTamBolenlerList.add(i);
            }
        }
        return pozitifTamBolenlerList;
    }
}
