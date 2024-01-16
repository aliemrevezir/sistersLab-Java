import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Fizik  notunuzu giriniz.");
        double fizik = scan.nextDouble();
        double mat, kimya, turk;
        System.out.println("Lütfen Matematik  notunuzu giriniz.");
        mat = scan.nextDouble();
        System.out.println("Lütfen Kimya  notunuzu giriniz.");
        kimya = scan.nextDouble();

        System.out.println("Lütfen Türkçe  notunuzu giriniz.");
        turk = scan.nextDouble();
        double ort = (mat + kimya + turk + fizik) / 4;
        System.out.println("Matematik notunuz: " + mat + "\nFizik notunuz: " + fizik + "\nKimya notunuz: " + kimya + "\nTürkçe notunuz: " + turk + "\nOrtlamanız: " + ort);

    }
}