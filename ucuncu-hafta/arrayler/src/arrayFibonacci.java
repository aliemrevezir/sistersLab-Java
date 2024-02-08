import java.util.Arrays;
import java.util.Scanner;

public class arrayFibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci dizisinin kaç elemanını görmek istiyorsunuz?");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        System.out.println(Arrays.toString(fibonacci(num)));
    }
    public static int[] fibonacci(int n){
        int[] fib = new int[n];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i <fib.length ; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib;
    }
}
