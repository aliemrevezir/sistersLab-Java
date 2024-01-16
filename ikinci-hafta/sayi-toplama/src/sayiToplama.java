public class sayiToplama {
    public static void main(String[] args) {
        int sayi = 0;
        int total = 0;
        while(sayi<=50){
            total +=sayi++;
        }
        System.out.println(total);
    }
}