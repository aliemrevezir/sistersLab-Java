import java.util.Scanner;

public class isArmstrong {
    public static int digitCounter(int number) {
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static int isArmstrong(int number) {
        int length = digitCounter(number);
        int sum = 0;
        int perm= number;
        while (number > 0) {
            for (int i = 0; i < length; i++) {
                sum += Math.pow(number % 10, length);
                number /= 10;
            }
        }

        return (sum == perm) ? 1 : 0;

    }

    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz...");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        if (isArmstrong(num) == 1) {
            System.out.println("Girdiğiniz sayı: " + num + " Armstrong sayısıdır.");
        } else {
            System.out.println("Girdiğiniz sayı: " + num + " Armstrong sayısı değildir.");
        }
    }
}