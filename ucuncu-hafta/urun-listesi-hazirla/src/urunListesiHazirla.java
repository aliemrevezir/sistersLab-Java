import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class urunListesiHazirla {
    public static void main(String[] args) {
        HashMap<String, Double> urun_listesi = new HashMap<>();
        Scanner key = new Scanner(System.in);
        while (true) {
            System.out.println("Girmek istediğiniz ürünün adını yazınız...\nUygulamadan çıkmak için q yazınız...");
            String urun = key.nextLine();
            if (urun.equals("q")) {
                System.out.println("Uygulama sonlandırılıyor...");
                break;
            }
            System.out.println("Ürünün fiyatını giriniz...");
            double fiyat = key.nextDouble();
            key.nextLine();//bug
            urun_listesi.put(urun, fiyat);
        }
        System.out.println("Urun Listesi");
        for (Map.Entry<String, Double> entry : urun_listesi.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}