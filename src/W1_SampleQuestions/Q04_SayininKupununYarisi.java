package W1_SampleQuestions;

import java.util.Scanner;

public class Q04_SayininKupununYarisi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        double sayi = scanner.nextDouble();
        double sayiKupu = sayi*sayi*sayi;
        System.out.println("\ngirdiginiz sayinin; \n kupunun yarisi = "+sayiKupu/2);
    }
}
