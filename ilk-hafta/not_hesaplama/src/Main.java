import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Not hesaplama programına hoşgeldiniz.");
        System.out.println("-------------------------------------");
        System.out.println("Lütfen sırasıyla sınav notlarını giriniz.");
        System.out.println("-------------------------------------");
        Scanner not1 = new Scanner(System.in);
        System.out.println("Lütfen 1. sınav notunuzu giriniz.");
        double not_1 = not1.nextInt();
        Scanner not2 = new Scanner(System.in);
        System.out.println("Lütfen 2. sınav notunuzu giriniz.");
        double not_2 = not2.nextInt();
        Scanner not3 = new Scanner(System.in);
        System.out.println("Lütfen final sınavı notunuzu giriniz.");
        double not_3 = not3.nextInt();
        double ortalama = not_1*0.3+not_2*0.3+not_3*0.4;
        System.out.println("Ortalamanız:"+((ortalama*100))/100);

    }
}