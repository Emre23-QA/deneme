package W06_arr_listArr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q07_tcNo {
    /*
    Dinamik olarak yeni bir tc no üreten metodu yazınız. Tc no aşağıdaki koşullara göre oluşturunuz.
    1) TC kimlik numarasının son rakamı çift olmak zorundadır.
    2) 0 rakamı ile başlayamaz.
    3) ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
    4) Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının
    toplamının birler basamağı 10. rakamı;
    5) 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
     */


    public static void main(String[] args) {
        System.out.println(tcNoUret());


    }

    public static List<Integer> tcNoUret() {
        Random random = new Random();
        List<Integer> tcNo = new ArrayList<>();

        //1.adim: ilk 9 hane
        for (int i = 0; i < 9; i++) {
            if (i == 0) {                          // sart_1 : ilk sayi 1-9 arasi olmali. 0 olmasin
                tcNo.add(random.nextInt(9)+1);  // boyle yazmak random un 1-9 dahil araliginda sayi üretmesini saglar
            } else {
                tcNo.add(random.nextInt(10) ); //random.n  bize 0-9 arasında (sınırlar dahil olmak üzere) rastgele bir tamsayı döndürür..
            }
        }

        //2.adim: 10. hane:
        // 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı;
        int tekToplam = 0;
        int ciftToplam = 0;
        for (int i = 0; i < 9; i++) {
            int tutucu = tcNo.get(i);
            if (i % 2 == 0) {
                tekToplam += tutucu;
            } else {
                ciftToplam += tutucu;
            }
        }
        int onuncuHane = (tekToplam * 7  +  ciftToplam * 9) % 10;
        tcNo.add(onuncuHane);

        //3.adim: 11. hane:
        //sart_1:  ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
        //sart_2:  1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
        int sonHane_ilkSart = (tekToplam + ciftToplam + onuncuHane) % 10;
        int sonHane_ikinciSart = (tekToplam * 8) % 10;  // ikinci sart herzaman cift sayi olur cift sayi ile carpildigindan
        if (sonHane_ilkSart == sonHane_ikinciSart ) {   // o yuzden bu if saglaniyorsa son hane zaten cift olur
            tcNo.add(sonHane_ilkSart);
        }else {
            tcNoUret();
        }
        return tcNo;
    }

}
