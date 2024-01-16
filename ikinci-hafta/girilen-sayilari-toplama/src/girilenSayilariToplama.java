import java.util.Scanner;

public class girilenSayilariToplama {
    public static void main(String[] args) {
        System.out.println("Toplama programına hoşgeldiniz...\n (Çıkmak için 0'a basınız.)");
        int num = 0;
        int temp=0;
        Scanner key = new Scanner(System.in);
        while (num!=1){
            int sayi = key.nextInt();

            temp+=sayi;
            if (sayi == 0) {
                num = 1;
            }
            else {
                System.out.println("Şu ana girdiğiniz değerler toplamı: "+ temp );
            }
        }
    }
}