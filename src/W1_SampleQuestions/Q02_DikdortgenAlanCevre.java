package W1_SampleQuestions;

import java.util.Scanner;

public class Q02_DikdortgenAlanCevre {
    public static void main(String[] args) {
       /* Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
               * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
               * Dikdortgenin Alani : uzun kenar * kisa kenar

        */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Dikdortgenin uzun kenarini  giriniz");
        double uzunKenar = scanner.nextDouble();
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        double kisaKenar = scanner.nextDouble();

        double alan = kisaKenar*uzunKenar;
        double cevre = 2*(uzunKenar+kisaKenar);

        System.out.println("Dikdortgenin alani = "+alan);
        System.out.println("Dikdortgenin cevresi = "+cevre);
    }
}
