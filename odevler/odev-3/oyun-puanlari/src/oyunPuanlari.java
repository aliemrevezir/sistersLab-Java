import java.util.HashMap;
import java.util.Scanner;

public class oyunPuanlari {
    /*
    Soru: Oyuncu Puanlari
    Bir oyuncu puan sistemini simule eden bir program yazin.
    Oyuncularin isimlerini anahtar, puanlarini deger olarak kullanarak bir HashMap icinde saklayin.
    Oyunculara puan eklemek ve puanlarini goruntulemek gibi islemleri gerceklestiren bir program yazin.
    */
    public static void main(String[] args) {
        System.out.println("X oyunu puan sistemi uygulamasına hoşgeldiniz...)");
        HashMap<String, Integer> puan_listesi = new HashMap<>();
        while (true) {
            System.out.println("Yeni puanlar girmek için 1'i, puan görüntülemek için 2'yi, çıkmak için 3'ü tuşlayınız.");
            Scanner key = new Scanner(System.in);
            int secenek = key.nextInt();
            key.nextLine();
            if (secenek == 1) {
                System.out.println("Ana menüye dönmek için q'ya basınız.");

                while (true) {
                    System.out.println("Lütfen puanını girmek istediğiniz oyuncunun kullanıcı adını giriniz.");
                    String isim = key.nextLine();
                    if (isim.equals("q")) {
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                    }
                    System.out.println("Lütfen oyuncunun puanını giriniz.");
                    int puan = key.nextInt();
                    key.nextLine();//bug
                    puan_listesi.getOrDefault(isim, puan);
                }
            }
            else if (secenek == 2) {
                System.out.println("Ana menüye dönmek için q'ya basınız.");

                while (true) {
                    System.out.println("Lütfen puanını görüntülemek istediğiniz oyuncunun kullanıcı adını giriniz.");
                    String isim = key.nextLine();
                    if (isim.equals("q")) {
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                    }
                    int puan = puan_listesi.get(isim);
                    System.out.println(isim + " adlı kullanıcının puanı: " + puan);
                }
            } else if (secenek==3) {
                System.out.println("Programdan çıkılıyor.");
                break;

            }

        }
    }
}