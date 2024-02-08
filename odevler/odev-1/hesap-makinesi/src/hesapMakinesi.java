import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap makinesi uygulamasına hoşgeldiniz!");
        System.out.println("----------------------------------------");
        Scanner key = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        double ilk_sayi = key.nextInt();
        System.out.println("Lütfen işlem operatörünü tuşlayınız...\n(+, -, /, *)");
        Scanner oper = new Scanner(System.in);
        String op = oper.next();
        System.out.println("Lütfen ikinci sayıyı giriniz...");
        double ikinci_sayi = key.nextInt();

        switch (op) {
            case "*":
                System.out.println(ilk_sayi * ikinci_sayi);
                break;
            case "-":
                System.out.println(ilk_sayi - ikinci_sayi);
                break;
            case "+":
                System.out.println(ilk_sayi + ikinci_sayi);
                break;
            case "/":
                if (ikinci_sayi == 0) {
                    System.out.println("ZeroDivisionError");

                } else {
                    System.out.println(ilk_sayi / ikinci_sayi);
                    break;
                }
            default:
                System.out.println("Geçerili Operatör giriniz...");
        }

    }
}