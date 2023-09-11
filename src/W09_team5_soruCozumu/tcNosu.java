package W09_team5_soruCozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tcNosu {
     /*
    Dinamik olarak yeni bir tc no üreten metodu yazınız. Tc no aşağıdaki koşullara göre oluşturunuz.
    1) 0 rakamı ile başlayamaz.

    2) Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının
    toplamının birler basamağı 10. rakamı;

    3) ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
    4) 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
    5) TC kimlik numarasının son rakamı çift olmak zorundadır.
  */
     public static void main(String[] args) {
         System.out.println("Dinamik olarak yeni bir tc no üreten metodu yazınız. Tc no aşağıdaki koşullara göre oluşturunuz.\n" +
                 "    1) 0 rakamı ile başlayamaz.\n" +
                 "\n" +
                 "    2) Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının\n" +
                 "    toplamının birler basamağı 10. rakamı;\n" +
                 "\n" +
                 "    3) ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.\n" +
                 "    4) 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.\n" +
                 "    5) TC kimlik numarasının son rakamı çift olmak zorundadır.");
         System.out.println(tcNoUret());
     }
     public static List<Integer> tcNoUret (){
         List<Integer> tcNOList= new ArrayList<>();
         Random random = new Random();

         //ADIM1: ILK 9 HANE
         //0 rakamı ile başlayamaz.
         for (int i = 0; i < 9; i++) {
             if(i==0){
                 tcNOList.add(random.nextInt(9)+1); // 1-9 arasında
             }else{
                 tcNOList.add(random.nextInt(10)); // 0-9 arasında
             }
         }

         //ADIM2: 10. HANE
         //  Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının
         //    toplamının birler basamağı 10. rakamı;
          int tekToplam=0;
         int ciftToplam=0;
         for (int i = 0; i < tcNOList.size(); i++) {
             if(i%2==0){
                 tekToplam+=tcNOList.get(i);
             }else {
                 ciftToplam+=tcNOList.get(i);
             }

         }
         System.out.println("tekToplam: "+tekToplam);
         System.out.println("ciftToplam: "+ciftToplam);
         int onuncuHane = (tekToplam*7+ciftToplam*9)%10;
         System.out.println("onuncuHane: " + onuncuHane);
         tcNOList.add(onuncuHane);

         //ADIM3: 11. HANE
         // ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
         //  1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
         //  TC kimlik numarasının son rakamı çift olmak zorundadır.

         int ilkSart =(tekToplam+ciftToplam+onuncuHane)%10;
         int ikinciSart= (tekToplam*8)%10;
         if(ilkSart==ikinciSart) {
             tcNOList.add(ilkSart);
         }else {
             tcNoUret();
         }
         System.out.println("onbirinciHane: " + ilkSart);
         return tcNOList;
     }

}