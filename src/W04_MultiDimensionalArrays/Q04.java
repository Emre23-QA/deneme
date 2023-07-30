package W04_MultiDimensionalArrays;

public class Q04 {
    /*Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini donduren bir method olusturun.
     */
    public static void main(String[] args) {
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        System.out.println(arrSonElementlerTop(arr));
    }
    public static int arrSonElementlerTop(int[][] arr){
        int toplam=0;
        for (int[] each:arr
             ) {
            toplam+=each[each.length-1];
        }
        return  toplam;
    }
}
