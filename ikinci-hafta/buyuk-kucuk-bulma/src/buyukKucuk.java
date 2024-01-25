import java.util.Scanner;

public class buyukKucuk {
    //Klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan program


    public static int findMax(int currentNumber, int number){
        if (number > currentNumber){
            return number;
        }else {
            return currentNumber;
        }
    }
    public static int findMin(int currentNumber, int number){
        if ( number < currentNumber){
            return number;
        }else {
            return currentNumber;
        }

    }

    public static void main(String[] args) {
        System.out.println("Kaç tane sayı girmek istiyorsunuz?");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            int currentNumber = key.nextInt();;
            min = findMin(currentNumber,min);
            max = findMax(currentNumber,max);
        }
        System.out.println(min);
        System.out.println(max);
    }
}