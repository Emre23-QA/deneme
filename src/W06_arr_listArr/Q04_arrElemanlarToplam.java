package W06_arr_listArr;

public class Q04_arrElemanlarToplam {
    /*Soru-39)
Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
Örn:
girdi : {1,2,3,4,5,6,7,8}
çıkış: 36
ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println("Array elemanlari toplami: "+arrElemanlariTopla(arr));
    }
    public static int arrElemanlariTopla (int[] arr){
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;
        }

        return toplam;
    }
}
