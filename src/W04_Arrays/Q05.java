package W04_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
// Soru 3- Verilen String bir listede
        //         istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun
        String[] arr = {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};
        List<String> isimler= new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        System.out.println(istenmeyenTuy(arr, "a"));
    }
    public static List<String> istenmeyenTuy (String[] arr,String istenmeyenTuy)
    {
        List <String> yeniIsimler=new ArrayList<>();
        for (String each:arr
             ) {
            if (!each.contains(istenmeyenTuy))
            {
yeniIsimler.add(each);
            }
        }
        return yeniIsimler;
    }
}
