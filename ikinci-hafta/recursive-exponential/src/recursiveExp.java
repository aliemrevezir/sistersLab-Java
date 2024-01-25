import java.util.Scanner;

public class recursiveExp {
    public static int recExp(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * recExp(base, (exp - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Lütfen sırasıyla sayı ve üs giriniz...");
        Scanner key = new Scanner(System.in);
        int base = key.nextInt();
        int us = key.nextInt();
        int result = recExp(base, us);
        System.out.println(result);
    }
}