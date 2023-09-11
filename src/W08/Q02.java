package W08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02 {
    /* Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        System.out.println(gunler);

        // 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        List<Double> gunlukKazanclar = new ArrayList<>();

        // 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        int sayac = 0;
        while (sayac < 7) {
            System.out.println(gunler.get(sayac) + " gunu icin gunluk kazanci giriniz :");
            double gunlukKazanc = scanner.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
            sayac++;
        }
    }

    // 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    public static Double getOrtalamaKazanc(List<Double> gunlukKazanclar) {
        double ortalamaKazanc=0.0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            ortalamaKazanc += gunlukKazanclar.get(i);
        }

return ortalamaKazanc;
    }

    //5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    // for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o günleri return yap.
public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(double ortalamaKazanc, List<Double> gunlukKazanclar, List<String> gunler){
        ArrayList<String> ortalamaninUstundeKazancGunleri = new ArrayList<>();
    for (int i = 0; i <gunler.size() ; i++) {
if (gunlukKazanclar.get(i)>ortalamaKazanc){
    ortalamaninUstundeKazancGunleri.add(gunler.get(i));
}
    }

        return ortalamaninUstundeKazancGunleri;
}
}
