package W07_constructor;

import java.util.Scanner;

public class Q02 {
    static Scanner scanner=new Scanner(System.in);
    /*Soru 43-)
Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
 Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
     */
    public static void main(String[] args) {
        String ogrenciAd="Ozan";
        String ogrenciSoyad="Karadeniz";
        int ogrenciNo=112;
        Changename(ogrenciAd,ogrenciSoyad,ogrenciNo);
        System.out.println(ogrenciAd);

    }
    public static void Changename(String ogrenciAd,String ogrenciSoyad,int ogrenciNo){
        System.out.println("yeni ogrenci adini girin : ");
       ogrenciAd = scanner.nextLine();
        System.out.println("yeni ogrenci soyadini girin : ");
        ogrenciSoyad= scanner.nextLine();
        System.out.println("yeni ogrenci nosunu girin : ");
        ogrenciNo=scanner.nextInt();


    }
    public static void Changesurname(String ogrenciSoyad){
        System.out.println("Yeni soyadi giriniz: ");
        String yeniSoyad= scanner.next();

    }
}
