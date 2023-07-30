package W02_StringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*Soru 1 : Kullanicidan bir cumle alin
                - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String metin = scanner.nextLine();
        if (metin.contains("ev")==true && metin.contains("is")==true){
            System.out.println("Hem ev lazim hem is");
        }
        else if (metin.contains("ev")==true) {
            System.out.println("home home sweet home");
        }
        else if (metin.contains("is")==true) {
            System.out.println("calismak guzeldir");
        }
        else System.out.println("cok calisman lazim");
    }
}
