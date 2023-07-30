package W01;

import C00.ScannCons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    /* 1. SORU
    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
    Örnek: 12 = 1 1 0 0

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir desimal deger giriniz: ");
        int sayi = scanner.nextInt();

        binaryCevir(sayi);

    }

    public static void binaryCevir(int sayi) {
        List<Integer> binarylist = new ArrayList<>();
        int bolum = sayi;


        while (bolum > 0) {
            int kalan = bolum % 2;
            binarylist.add(0, kalan);
            bolum /= 2;
        }
        System.out.print(sayi + " = ");

        for (int i = 0; i < binarylist.size(); i++) {
            System.out.print(binarylist.get(i) + " ");
        }
    }
}
