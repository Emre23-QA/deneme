package W1_SampleQuestions;

import java.util.Scanner;

public class Q06_CaySeker {
    public static void main(String[] args) {
        /*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
 Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
 1 şeker = 1.5 gr
1 kg = 1000 gram      olarak hesaplayınç
 Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir gunde kac tane cay ictiginizi giriniz : ");
       int cay = scanner.nextInt();
        System.out.println("Lutfen bir gunde kac tane seker kullandiginizi giriniz : ");
        double seker = scanner.nextDouble();
        int cayYil = cay*365;
        double sekerYilGram= seker*365*1.5;
        double sekerYilKg = sekerYilGram/1000;

        System.out.println("bir yilda "+"'"+cayYil+"'"+" tane cay iciyorsunuz");
        System.out.println("bir yilda "+"'"+sekerYilKg+"'"+" KG seker kullaniyorsunuz");
    }
}
