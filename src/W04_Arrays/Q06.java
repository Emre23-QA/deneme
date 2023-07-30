package W04_Arrays;

public class Q06 {
    /*Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimelerin ilkini  yazdiran bir method
olusturun.

     */
    public static void main(String[] args) {
        String[] arr = {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};
        EnUzunEnKisaKelimeleriYaz(arr);
    }
    public static void EnUzunEnKisaKelimeleriYaz(String[]arr)
    {
        String uzunKelime= arr[0];
        String kisaKelime=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (uzunKelime.length()<arr[i].length())
            {
                uzunKelime=arr[i];
            }
            if (kisaKelime.length()>arr[i].length())
            {
                kisaKelime=arr[i];
            }
        }
        System.out.println("En uzun kelime : "+uzunKelime+"\nEn kisa kelime : "+kisaKelime);


    }
}
