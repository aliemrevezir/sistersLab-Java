import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Soru: Ogrenci Notlari
Bir ogrenci not takip sistemi yazin. Her ogrencinin adini anahtar,
notunu deger olarak iceren bir HashMap kullanarak, kullaniciya ogrenci eklemesini ve
bir ogrencinin notunu sorgulamasini saglayan bir program yapin.
*/
public class ogrenciNotGirme {
    public static void main(String[] args) {
        HashMap<String, Double> not_listesi = new HashMap<>();
        Scanner key = new Scanner(System.in);
        System.out.println("Not girme uygulamasına hoşgeldiniz...\nÇıkmak için q'ya basınız.");
        while (true) {
            System.out.println("Lütfen öğrencinin ismini giriniz:");
            String isim = key.next();
            if (isim.equals("q")) {
                System.out.println("Sistemden çıkılıyor...");
                break;
            }
            System.out.println(isim + " öğrencisinin notunu giriniz.");
            Double not = key.nextDouble();
            key.nextLine();//bug
            not_listesi.put(isim, not);
        }

        key.nextLine();//bug

        System.out.println("Hangi öğrencinin notunu istiyorsunuz?");
        String sorgu = key.nextLine();
        if (not_listesi.containsKey(sorgu)) {
            System.out.println(sorgu + " öğrencisinin notu: " + not_listesi.get(sorgu));
        }
    }
}