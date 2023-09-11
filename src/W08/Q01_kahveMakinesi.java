package W08;

import java.util.Scanner;

public class Q01_kahveMakinesi {
    /*Basit bir Kahve makinesi oluşturun.
1. Şart
 3 çeşit kahvemiz olsun.
  Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

  Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
2.Şart
  Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
3. Şart
  Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
  sorusunu sorsun.
4. Şart
  Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
  sorusunu sorsun.
Sonuç
   Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
     */


    public static void main(String[] args) {
        kahveSecme();
        sutSecme();
        sekerSecme();
        boyutSecme();
    }
    public static void kahveSecme(){
        String kahve =null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("*****************    KAHVE MAKİNESİNE HOŞGELDİNİZ    *****************\n" +
                "LÜTFEN SEÇMEK İSTEDİĞİNİZ KAHVE CİNSİNİ NUMARASINA BASARAK SEÇİNİZ\n" +
                "1.Türk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:  kahve= "Türk kahvesi"; break;
            case 2:  kahve= "Filtre Kahve"; break;
            case 3:  kahve= "Espresso"; break;
            default:
                System.out.println("gecersiz giris yaptiniz!!");
                kahveSecme();
        }
    }
    public static void sutSecme(){

    }
    public static void sekerSecme(){

    }
    public static void boyutSecme(){

    }
}
