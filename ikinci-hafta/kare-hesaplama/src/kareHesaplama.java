import java.util.Scanner;

public class kareHesaplama {
    public static void main(String[] args) {
        System.out.println("Karesini almak istediğiniz sayıyı yazınız: \n(Çıkmak için 0'ı tuşlayın.)");
        int num = 0;
        Scanner key = new Scanner(System.in);
        while (num!=1){
            int sayi = key.nextInt();
            if (sayi == 0) {
                num = 1;
            }
            else {
                System.out.println("Girdiğiniz sayının karesi: " + sayi*sayi);
                System.out.println("************************");
                System.out.println("Tekrar bir sayı giriniz.");
            }
        }

    }
}