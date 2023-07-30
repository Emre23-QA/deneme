package W03_Loops;

import java.util.Scanner;

public class Q03_soru18_VarisSuresi {

    public static void main(String[] args) {
        /*Soru 18-) Method Sorusu
Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
 Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın ve dondursun
İpucu:
yol=Hız*zaman
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen arac hizini giriniz :");
        double hiz = scanner.nextDouble();
        System.out.println("lutfen yol kilometresini giriniz :");
        double yolKm = scanner.nextDouble();

        System.out.println("Varis sureniz : "+varisSuresiHesaplama(hiz,yolKm)+" saat");

    }

    public static double varisSuresiHesaplama (double hiz,double yolKm)
    {
        double variSuresi = yolKm/hiz;
        return variSuresi;
    }
}
