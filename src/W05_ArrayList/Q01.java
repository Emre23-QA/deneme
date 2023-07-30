package W05_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {
        /*// Soru 3- Verilen String bir listede
        //         istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun

         */
        String[] arr = {"Mehmet", "Ramazan", "Ozan", "Berk", "Nergiz", "Ayfer", "Bugra"};
        List<String> isimler = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            isimler.add(arr[i]);

        }

        System.out.println(isimler);
        System.out.println(istenmeyeniSil(isimler,"a"));
    }

    public static List<String> istenmeyeniSil(List<String> arrList, String istenmeyenHarf) {
        String tutucu = null;
        List<String> yeniList = new ArrayList<>();
        for (int i = 0; i < arrList.size(); i++) {
            if (!arrList.get(i).contains(istenmeyenHarf)) {
               yeniList.add(arrList.get(i));

            }
        }
        return yeniList;
    }

}
