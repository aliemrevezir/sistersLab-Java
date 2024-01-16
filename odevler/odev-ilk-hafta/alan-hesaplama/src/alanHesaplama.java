import java.util.Scanner;

public class alanHesaplama {
    public static void main(String[] args) {
        System.out.println("Alan hesaplama programına hoşgeldiniz.");
        System.out.println("Lütfen geometrik şeklin cinsini giriniz." +
                "\n(1-Dikdörtgen, 2-Kare, 3-Eşkenar üçgen, 4- Daire)");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        System.out.println("************************************");
        switch (num){
            case 1:
                double kenar1= key.nextInt();
                double kenar2= key.nextInt();
                System.out.println("Dikdörtgenin alanı: " + kenar2*kenar1 + " m^2'dir.");
                break;
            case 2:
                double kenar= key.nextInt();
                System.out.println("Karenin alanı: " + kenar*kenar + " m^2'dir.");
                break;
            case 3:
                double kenarEs= key.nextInt();
                System.out.println("Eşkenar üçgenin alanı: " + kenarEs*kenarEs*Math.sqrt(3)/4 + " m^2'dir.");
                break;
            case 4:
                double yaricap= key.nextInt();
                System.out.println("Dairenin alanı: " + Math.PI*(yaricap*yaricap) + " m^2'dir.");
                break;

        }
    }
}