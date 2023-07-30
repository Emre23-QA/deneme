package W1_SampleQuestions;

import java.util.Scanner;

public class Q01_DaireAlaniCevresi {
    public static void main(String[] args) {
       /* Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
                * r=7;
                * Pi=3.14
                * Dairenin Cevresi : 2*Pi*r
                * Dairenin Alani : Pi*r*r
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("r = 7 için dairenin alani : "+ 3.14*7*7);
        System.out.println("r = 7 için dairenin cevresi: "+ 2*3.14*7+"\n");
        System.out.println("Farkli bir yaricap için asagiya 'r' değerini giriniz:");
        double r = scanner.nextDouble();
        System.out.println("r = "+r+" için dairenin alani : "+ 3.14*r*r);
        System.out.println("r = "+r+" için dairenin cevresi: "+ 2*3.14*r);



    }
}
