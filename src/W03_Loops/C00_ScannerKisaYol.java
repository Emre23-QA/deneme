package W03_Loops;

import java.util.Scanner;

public class C00_ScannerKisaYol {
    public static void main(String[] args) {


    }
    public static String scanKisaYol(String istek,String variableAdi)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen "+istek+" giriniz:");
        variableAdi =scanner.nextLine();
        String str1= variableAdi;

        return str1;
    }

}

