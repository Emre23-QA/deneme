package W07_constructor;

public class Q01 {
    /*Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
     */
    String nesne = "Kalem";
   String renk ="Kirmizi";
    int adet = 5;
    Q01(){

    }
    Q01(String nesne,String renk,int adet){
        this.nesne=nesne;
        this.renk=renk;
        this.adet=adet;
    }

    @Override
    public String toString() {
        return "Q01{" +
                "nesne='" + nesne + '\'' +
                ", renk='" + renk + '\'' +
                ", adet=" + adet +
                '}';
    }

    public static void main(String[] args) {
        Q01 obj1=new Q01();
        System.out.println(obj1.toString());
        System.out.println(obj1.adet+obj1.nesne+obj1.renk);
        Q01 obj2=new Q01("Masa","mavi",10);
        System.out.println(obj2.toString());
        System.out.println(obj2.nesne+obj2.renk+obj2.adet);


    }
}
