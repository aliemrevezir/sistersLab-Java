import java.util.Scanner;

public class asalMi {
    public static int isPrime(int number){
        int isPrimestatus = 0;
        for (int i = 2; i < number ; i++) {
            if (number%i == 0) {
                isPrimestatus=1;;
                break;
            }else {
                isPrimestatus = 0;
            }

        }
        return isPrimestatus;
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        if (isPrime(num) == 1) {
            System.out.println("Girdiğiniz sayı: " + num+" asal değildir.");

        }else{System.out.println("Girdiğiniz sayı: " + num+" asaldır.");}
    }



}