import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci dizisinde görmek istediğiniz terim sayısını giriniz...");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
