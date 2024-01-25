import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        System.out.println("Faktöriyel alma programına hoşgeldiniz...");
        System.out.println("Faktöriyeli alınmasını istediğiniz bir sayı girin: ");
        Scanner key = new Scanner(System.in);
        long num = key.nextInt();
        long carpim = 1;
        while (num > 1) {
            carpim *= num--;

        }
        System.out.println("Çarpım: " + carpim);
    }
}