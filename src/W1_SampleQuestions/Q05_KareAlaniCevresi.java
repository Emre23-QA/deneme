package W1_SampleQuestions;

import java.util.Scanner;

public class Q05_KareAlaniCevresi {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın.
        // Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz : ");
        double kenar = scanner.nextDouble();
        System.out.println("karenin " +
                "\n alani = "+ kenar*kenar +
                "\n cevresi = "+4*kenar);
    }
}
