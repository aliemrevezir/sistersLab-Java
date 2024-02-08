import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class satisTakibi {
/*

Soru: Satis Takibi

Bir sirketin satislarini takip eden bir program yazin. Her musterinin adini anahtar,
satis miktarini deger olarak iceren bir
HashMap kullanin. Toplam satis miktarini hesaplayarak
en cok satis yapan musteriyi bulan bir program yazin.
 */
    public static void main(String[] args) {
        HashMap<String, Integer> satis_listesi = new HashMap<>();
        String musteri = "";
        while (true) {
            System.out.println("Yeni satışlar girmek için 1'i, çıkmak için 2'yi tuşlayınız.");
            Scanner key = new Scanner(System.in);
            int secenek = key.nextInt();
            key.nextLine();
            if (secenek == 1) {
                System.out.println("Ana menüye dönmek için q'ya basınız.");
                while (true) {
                    System.out.println("Lütfen kullanıcının adını giriniz.");
                    String isim = key.nextLine();
                    if (isim.equals("q")) {
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                    }
                    System.out.println("Lütfen kullanıcının aldığı ürün sayısını giriniz.");
                    int satis = key.nextInt();
                    key.nextLine();//bug
                    satis_listesi.put(isim, satis);
                }
            } else if (secenek==2) {
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            int toplam_satis = 0;
            for(int i : satis_listesi.values()){
                toplam_satis += i;
            }
            System.out.println("Bu ayki toplam satış sayısı: "+ toplam_satis);
            int maksimum_satis = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry : satis_listesi.entrySet()) {
                if(entry.getValue()>maksimum_satis){
                    maksimum_satis = entry.getValue();
                    musteri = entry.getKey();
                }
            }
            System.out.println("En çok satış yapılan müşteri: "+ musteri);
            }
        }
}