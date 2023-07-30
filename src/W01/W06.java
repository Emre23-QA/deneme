package W01;

import java.util.Scanner;

public class W06 {
    //alinan 3 basamakli sayi 11 ile bölünüyor mu yaz
    public static void main(String[] args) {
        Scanner scanner;
        System.out.println("3 basamakli bir tam sayi giriniz: ");
        int sayi =101;

        while (sayi>=100&&sayi<1000)
        {
            scanner=new Scanner(System.in);
            sayi= scanner.nextInt();
            if (sayi>=1000||sayi<100)
            {
                System.out.println("sayi 3 basamakli degil");
            }
            else if (sayi%11==0)
            {
                System.out.println("sayi 11 ' e tam bolunur");
            }
            else System.out.println("sayi 11' e bolunmez");
        }


    }
}
