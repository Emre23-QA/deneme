package W01;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_StringToCharArray {
    /*Soru 35-)
Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir isim giriniz: ");
        String isim= scanner.next();

        strToChArray(isim);
    }
    public static void strToChArray(String isim)
    {
        char[] chArr=new char[isim.length()];

        for (int i = 0; i < isim.length(); i++) {
            chArr[i]=isim.charAt(i);
        }
        System.out.println(Arrays.toString(chArr));
    }

}
