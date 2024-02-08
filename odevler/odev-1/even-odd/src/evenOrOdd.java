import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println("Tek mi Çift mi uygulamasına hoşgeldiniz...");
        System.out.println("------------------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        int kalan = key.nextInt() % 2;
        if (kalan == 1) {
            System.out.println("Girdiğiniz sayı tektir...");
        } else {
            System.out.println("Girdiğiniz sayı çifttir...");

        }

    }
}