package W04_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q11 {
    /*// Soru- Verilen iki array’in elementlerini karsilastirip,
        //       ikisinde ortak olan elementleri ayri bir liste olarak vermesini saglayin.

     */
    public static void main(String[] args) {
        String[] str1 = {"Esra","Ali","Neriman","Selim","Inci","Yigit","Ayse","Inci"};
        String[] str2 = {"Emine","Kiraz","Inci","ali","Selim","Hilmi"};

        List<String>ayriList=new ArrayList<>();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j <str2.length ; j++) {
               if (str1[i].equals(str2[j])) {
                   if (!ayriList.contains(str1[i])) {
                       ayriList.add(str1[i]);
                   }
               }
            }
        }
        System.out.println(ayriList);
    }

}
