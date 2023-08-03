package W06_arr_listArr;

import java.util.Scanner;

public class Q01_arrayinOrtaElemaniniBul {
/*Soru 36-)
Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)

Örnek:
inputarr[]=   {1,2,3,4,5,6,7}
output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
 Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
 */
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Lutfen array'i elemanlarinin aralarina (,) koyarak giriniz : \n" +
            "e.g. : int[]={1,2,3} icin --> 1,2,3 giriniz.");
    String str= scanner.nextLine();
    String[] arr = str.split(",");
    str=arrOrtaElemaniBul(arr);
}
public static String arrOrtaElemaniBul (String[] arr){
    int arrUzunluk = arr.length;
    String ortaEleman ;
    if (arrUzunluk%2==0){
        System.out.println("array cift sayida eleman icerdigi icin orta elemani yoktur.");
        ortaEleman="";
    }else {
        int ortaElemanIndex= (arrUzunluk-1)/2;
        ortaEleman=arr[ortaElemanIndex];
    }

    return ortaEleman;
}
}
