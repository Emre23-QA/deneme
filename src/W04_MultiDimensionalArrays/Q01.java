package W04_MultiDimensionalArrays;

public class Q01 {
    /*- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
method olusturun.

     */
    public static void main(String[] args) {
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        multDimsArrCiftSayilarTop(arr);
    }
    public static void multDimsArrCiftSayilarTop(int[][]arr){
        int toplam = 0;

        for (int[] each1: arr
             ) {
            for (int each2: each1
                 ) {
                if (each2%2==0){
                    toplam += each2;
                }
            }
        }
        System.out.println("Cift sayilar toplami : " + toplam);
    }
}
