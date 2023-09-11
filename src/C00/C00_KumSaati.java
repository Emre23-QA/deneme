package C00;

public class C00_KumSaati {
    public static void main(String[] args) {
        String kSaat1 = "___________\n" +
                        "|xxxxxxxxx|\n" +
                        "||xxxxxxx||\n" +
                        "|||xxxxx|||\n" +
                        "||||xxx||||\n" +
                        "|||||x|||||";
        System.out.println(kSaat1);
        String kSaat3= kSaat1.replace("x"," ");
        String kSaat2 ="";
        for (int i = kSaat1.length()-1; i >=0 ; i--) {
            kSaat2 += kSaat1.replace("x"," ").charAt(i);
        }
        kSaat2=kSaat2.replace("x"," ");
        System.out.println(kSaat2);
        for (int j = 0; j < 25; j++)
        {
            try {
                Thread.sleep(1000); // 1 saniye bekletme
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            kSaat1=kSaat1.replaceFirst("x", " ");
            System.out.println(kSaat1);



            //System.out.println(kSaat1);
            //System.out.println(kSaat2);
           // panel.revalidate();

        }
    }
}
