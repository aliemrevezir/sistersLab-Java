public class donguToplama {
    public static void main(String[] args) {
        System.out.println("Karmasik toplama...");
        int toplam = 0;
        for (int i = 50; i >=1 ; i--) {
            if (i % 20==0) {
                toplam += 0;
            }
            else {
                toplam += i;
            }
        }
        System.out.println(toplam);
    }
}