import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        System.out.println("Sayı sıralama oyununa hoşgeldiniz...");
        System.out.println("------------------------------------");
        System.out.println("Lütfen 1. sayıyı giriniz...");
        Scanner key = new Scanner(System.in);
        double sayi1 = key.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Lütfen 2. sayıyı giriniz...");
        double sayi2 = key.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Lütfen 3. sayıyı giriniz...");
        double sayi3 = key.nextInt();
        if (sayi1 > sayi2) {
            double temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        if (sayi2 > sayi3) {
            double temp = sayi2;
            sayi2 = sayi3;
            sayi3 = temp;
        }

        if (sayi1 > sayi2) {
            double temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        System.out.println("Sıralama: " + sayi1 + ", " + sayi2 + ", " + sayi3);
    }

    }
/*
ChatGPT'den yardım aldım.
 */