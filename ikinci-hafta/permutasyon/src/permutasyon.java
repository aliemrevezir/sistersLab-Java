import java.util.Scanner;

public class permutasyon {
    public static int faktoriyel(int number){
        if (number ==1 || number ==0){
            return 1;
        }else{
            return number * faktoriyel(number-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Permüstasyonun alınmasını istediğiniz değerleri sırasıyla giriniz...");
        Scanner key = new Scanner(System.in);
        int num= key.nextInt();
        int num2 = key.nextInt();
        if (num2 > num) {
            System.out.println("Lütfen geçerli sayılar giriniz...");

        }
        System.out.println(faktoriyel(num)/faktoriyel(num-num2));
    }
}