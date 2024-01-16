import java.util.Scanner;

public class ortancaSayiOyunu {
    public static void main(String[] args) {
        System.out.println("3 elemanlı ortanca elemanı bulma oyununa hoşgeldiniz...");
        System.out.println("--------------------------------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz...");
        System.out.println("----------------------------");
        int sayi1 = key.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz...");
        System.out.println("----------------------------");
        int sayi2 = key.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz...");
        System.out.println("----------------------------");
        int sayi3 = key.nextInt();
        System.out.println("----------------------------");
        if (sayi1 >= sayi2 && sayi1 <= sayi3 || sayi1 <= sayi2 && sayi1 >= sayi3) {
            System.out.println("Ortanca sayı " + sayi1);
        } else if (sayi2 >= sayi1 && sayi2 <= sayi3 || sayi2 <= sayi1 && sayi2 >= sayi3) {
            System.out.println("Ortanca sayı: " + sayi2);
        } else {
            System.out.println("Ortanca sayı: " + sayi3);
        }
    }
}