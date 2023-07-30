package W05_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
     /*// Soru 3- Verilen String bir listede
        //         istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun

      */
        String[] arr = {"Mehmet", "Ramazan", "Ozan", "Berk", "Nergiz", "Ayfer", "Bugra"};
        List<String> isimler = new ArrayList<>();

        for (String each : arr
        ) {
            isimler.add(each);
        }
        System.out.println(istenmeyeniSil(isimler, "a"));
    }

    public static List<String> istenmeyeniSil(List<String> isimler, String istenmeyenHarf)
    {
        List<String> yeniList = new ArrayList<>();
        for (String list : isimler
             ) {
if (!list.contains(istenmeyenHarf))
{
    yeniList.add(list);
}
        }


        return yeniList;
    }
}
