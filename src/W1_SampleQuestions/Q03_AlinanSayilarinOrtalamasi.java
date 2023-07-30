package W1_SampleQuestions;

import java.util.Scanner;

public class Q03_AlinanSayilarinOrtalamasi {
    public static void main(String[] args) {
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        double a=0,toplam=0,ort=0;
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.println(i+1+". sayiyi giriniz : ");
            a=scanner.nextDouble();
            toplam+=a ;
        }
        ort = toplam/5;
        System.out.println("\n Girdiginiz 5 sayinin ortalamasi = "+ort);
    }
}
