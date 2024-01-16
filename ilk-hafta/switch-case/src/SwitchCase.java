import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Lütfen haftanın kaçıncı gününde olduğumuzu giriniz:");
        int num = key.nextInt();
        switch (num) {
            case 1:
                System.out.println("Günlerden Pazartesi");
                break;
            case 2:
                System.out.println("Günlerden Salı");
                break;
            case 3:
                System.out.println("Günlerden Çarşamba");
                break;
            case 4:
                System.out.println("Günlerden Perşembe");
                break;
            case 5:
                System.out.println("Günlerden Cuma");
                break;
            case 6:
                System.out.println("Günlerden Cumartesi");
                break;
            case 7:
                System.out.println("Günlerden Pazar");
                break;
            default:
                System.out.println("Değer 1 ile 7 arasında olmalıdır...");
        }
    }
}