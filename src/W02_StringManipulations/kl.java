package W02_StringManipulations;

import java.util.Scanner;

public class kl {
    public static void main(String[] args) {
       // Scanner scanner=new Scanner(System.in);
       // System.out.println("hj");
       // double a= scanner.nextDouble();
       // System.out.println("hj");
       // double b= scanner.nextDouble();
       // double n= a;
       // double m=b;
       // System.out.println(n+m);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Şifrenizi giriniz.");

        String sifre="scanner.nextLine();";
        System.out.println(sifre.replace('s','a'));

       /* if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) {
            System.out.println("ilk harf kucuk harf olmali");
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("son karakter rakam olmali");
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
        }
        if (sifre.length()<10) {
            System.out.println("uzunlugu en az 10 karakter olmali");
        }
        else {
            System.out.println("sifre basariyla kaydedildi");
        }
        String b = "Ali  12  ?_";
        System.out.println(b.replaceAll("\\S", "*"));

        */



    }
}
