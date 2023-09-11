package W07_constructor;

import java.time.LocalDateTime;

public class Q03_islemSuresi {
    public static void main(String[] args) {
        LocalDateTime zaman1= LocalDateTime.now();
        int baslama = zaman1.getNano();
        int toplam=0;
        for (int i = 1; i < 100000; i++) {
            toplam+=i;
        }
        LocalDateTime zaman2=LocalDateTime.now();
        int bitis = zaman2.getNano();
        System.out.println("islem suresi : " + (bitis - baslama));
    }
}
