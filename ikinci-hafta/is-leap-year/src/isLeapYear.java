import javax.script.ScriptContext;
import java.util.Scanner;

public class isLeapYear {

    public static int isLeap(int number) {
        int isLeap = 0;
        if ((number % 100 != 0 && number % 4 == 0) || number % 400 == 0) {
            isLeap = 1;
        }

        return isLeap;
    }


    public static void main(String[] args) {
        System.out.println("Hangi yılın artık olup olmadığını öğrenmek istersiiz?");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        if (isLeap(num) == 1) {
            System.out.println(num + " yılı artık yıldır.");
        } else {
            System.out.println(num + " yılı artık değildir.");
        }

    }
}