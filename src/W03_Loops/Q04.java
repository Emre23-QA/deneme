package W03_Loops;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        /*Soru 19-)  Method Sorusu
Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
ipucu:
Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kacinci ayda dogdugunuzu giriniz:");
        byte dogumAyi = scanner.nextByte();
        System.out.println(dogumAyi + ".ayin kacinci gununde dogdugunuzu giriniz:");
        byte dogumGunu = scanner.nextByte();
    }

    public static void burcBulma(byte ay, byte gun)
    {
        int ayGun = ay + gun;


    }
}
