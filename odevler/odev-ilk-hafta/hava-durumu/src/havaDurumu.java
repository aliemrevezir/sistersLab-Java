import java.util.Scanner;

public class havaDurumu {
    public static void main(String[] args) {
        System.out.println("Hava durumu uygulamasına hoşgeldiniz...");
        System.out.println("***************************************");
        System.out.println("Lütfen geçerli bir değer giriniz.\n(1,2,3,4)");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        System.out.println("***************************************");

        switch (num){
            case 1:
                System.out.println("Bugün hava güneşlidir.");
                break;
            case 2:
                System.out.println("Bugün hava yağmurludur.");
                break;
            case 3:
                System.out.println("Bugün hava rüzgârlıdır.");
                break;
            case 4:
                System.out.println("Bugün hava karlıdır.");
                break;

        }
    }
}