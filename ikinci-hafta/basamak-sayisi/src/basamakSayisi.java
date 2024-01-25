import java.util.Scanner;

public class basamakSayisi {
    //Girilen sayının basamak sayısını ve basamaklarının toplamını yazdıran program...
    public static int sumDigits(int number){
        int sum = 0;
        while(number>0){
            sum += number % 10;
            number /=10;

        }
        return sum;

    }
    public static int digitCounter(int number){
        int counter = 0;
        while(number>0){
            number /=10;
            counter++;
        }
        return counter;
    }



    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();

        int digitSum = sumDigits(num);
        int digits = digitCounter(num);
        System.out.println(digitSum);System.out.println(digits);
    }
}