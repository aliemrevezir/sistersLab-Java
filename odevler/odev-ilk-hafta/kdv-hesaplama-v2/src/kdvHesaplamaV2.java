import java.util.Scanner;

public class kdvHesaplamaV2 {
    public static void main(String[] args) {
        System.out.println("KDV Hesaplama Uygulamasına Hoşgeldiniz...");
        System.out.println("---------------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.println("Lütfen tutarı giriniz...");
        System.out.println("------------------------");
        double tutar = key.nextDouble();

        double kdvOrani;
        if ( tutar <= 1000.0 && tutar>=0) {
            kdvOrani = 10;
        } else {
            kdvOrani = 22;

        }

        double kdvli_tutar = tutar * (1 + (kdvOrani / 100));
        System.out.println("--------------------------------");
        System.out.println("KDV'li tutar: " + kdvli_tutar);
        System.out.println("****************************");
        System.out.println("KDV'siz tutar: " + (tutar));
        System.out.println("****************************");
        System.out.println("KDV oranınız: " + kdvOrani + "%");
        System.out.println("****************************");
    }
}

/*
Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10 ,
tutar 1000 TL'den buyuk ise KDV oranini %22 olarak
KDV tutari hesaplayan programi yaziniz.
 */