package W04_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_StringToCharArray {

    public static void main(String[] args) {

        /*Soru 35-)
              Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		      --> toCharArray() yöntemini kullanmayın
Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz: ");
        String isim = scanner.next();


        stringi_CharArray_Yazdir(isim);

    }
    public static void stringi_CharArray_Yazdir(String isim)
    {
        int isimSize = isim.length();
        char[] chIsim = new char[isimSize];

        for (int i = 0; i < isimSize; i++) {
            chIsim[i]=isim.charAt(i);

        }

        System.out.println(Arrays.toString(chIsim));
    }
}
