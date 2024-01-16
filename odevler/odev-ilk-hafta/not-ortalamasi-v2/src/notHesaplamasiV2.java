import java.util.Scanner;

public class notHesaplamasiV2 {
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
        if (ort > 80) {
            System.out.println("Notunuz AA");

        } else if (ort > 75) {
            System.out.println("Notunuz BA");

        } else if (ort > 70) {
            System.out.println("Notunuz BB");

        } else if (ort > 65) {
            System.out.println("Notunuz CB");

        } else if (ort > 60) {
            System.out.println("Notunuz CC");

        } else if (ort > 55) {
            System.out.println("Notunuz DC");
        } else if (ort > 50) {
            System.out.println("Notunuz DD");
        } else if (ort <= 50) {
            System.out.println("Dönem tekrarı");

        }
    }
}