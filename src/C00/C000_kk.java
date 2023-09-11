package C00;

public class C000_kk {

        public static void main(String[] args) {
            int i=0;

            while (true) {
                 i++;
                System.out.print(i);
                try {
                    Thread.sleep(1000); // 1 saniye bekle
                    System.out.print("\r"); // carraige return (imleci başa getir)
                    Thread.sleep(1000); // 1 saniye bekle
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}
