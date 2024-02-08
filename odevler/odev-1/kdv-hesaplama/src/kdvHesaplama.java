import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        System.out.println("KDV Hesaplama Uygulamasına Hoşgeldiniz...");
        System.out.println("---------------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.println("Lütfen tutarı giriniz...");
        System.out.println("------------------------");
        double tutar = key.nextDouble();
        System.out.println("Lütfen KDV oranını giriniz...");
        System.out.println("--------------------------------");
        double kdvOrani = key.nextDouble();
        double kdvli_tutar = tutar*(1+(kdvOrani/100));
        System.out.println("--------------------------------");
        System.out.println("KDV'li tutar: "+ kdvli_tutar);
        System.out.println("****************************");
        System.out.println("KDV'siz tutar: "+(tutar));
        System.out.println("****************************");
        System.out.println("KDV oranınız: "+ kdvOrani +"%");
        System.out.println("****************************");
    }
}