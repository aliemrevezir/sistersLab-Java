import java.util.HashMap;
import java.util.Scanner;

public class urunFiyat {
    public static void main(String[] args) {
        HashMap<String, Integer> urun_listesi = new HashMap<>();
        urun_listesi.put("Su", 5);
        urun_listesi.put("Kola", 20);
        urun_listesi.put("Salep", 20);
        urun_listesi.put("Maden suyu", 10);
        urun_listesi.put("Çay", 7);
        urun_listesi.put("Türk kahvesi", 10);
        System.out.println("Lütfen ürün giriniz...\n("+urun_listesi.keySet()+")");
        Scanner key = new Scanner(System.in);
        String urun = key.nextLine();
        if (urun_listesi.containsKey(urun)){
            System.out.println(urun + " fiyatı: "+urun_listesi.get(urun)+"TL'dir");
        }else{
            System.out.println("Aradığınız ürün bulunmamaktadır...");
        }
    }
}