package W02_StringManipulations;

public class Q10_enUzunEnKisaKelime {
    public static void main(String[] args) {
        /*/*
        Soru 6- Verilen String bir array’deki ilk bulunan en uzun
        ve en kisa kelimeleri yazdiran bir kod olusturun.
         */
        String[] isimler = {"Resul", "Omer", "Mehmet", "Ertugrul", "Ozan","Süleyman"};

        String uzunIsim= isimler[0];
        String kisaIsim= isimler[0];

        for (int i = 0; i < isimler.length; i++)
        {
            if (isimler[i].length()>uzunIsim.length())
            {
                uzunIsim=isimler[i];
            }
            if (isimler[i].length()<kisaIsim.length())
            {
               kisaIsim=isimler[i];
            }
        }

        System.out.println("en uzun isim : "+uzunIsim);
        System.out.println("en kisa isim : "+kisaIsim);
    }
}
