package W02_StringManipulations;

import java.util.Scanner;

public class Q08_StringManipulation {

    public static void main(String[] args) {
        /*Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
Ipucu: IF ile çözebilirsiniz.
Giriş :
		 > Gandalf Grey 563245879632
Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632

         */

		  Scanner scanner=new Scanner(System.in);
        System.out.println("Adinizi giriniz:");           //ad alma
        String ad= scanner.next();
        System.out.println("Soyadinizi giriniz:");        //Soyad alma
        String soyad= scanner.next();
        System.out.println("Kart numaranizi giriniz:");   //kart no alma
        String kartNo= scanner.next();


        boolean sart1 =(ad.charAt(0)>='A'&&ad.charAt(0)<='Z'&&soyad.charAt(0)>='A'&&soyad.charAt(0)<='Z');
        boolean sart2 = kartNo.length()==16;
        // String Manipulation
       if (sart2){
           if (sart1){
               String adManipulate=ad.charAt(0)+ad.substring(1).replaceAll("\\w","*");
               String soyadManipulate=soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");
               String kartNoManipulate=kartNo.substring(0,12).replaceAll("\\w","*")+kartNo.substring(12);

               System.out.println("isim : "+adManipulate+" "+soyadManipulate);
               System.out.println("CCN : "+kartNoManipulate);

           }
       }else System.out.println("Geçersiz kredi kartı numarası");


    }


}
